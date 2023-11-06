
package l.caso3poo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import org.bson.Document;


public class Conectar {
    public MongoClient CrearConexion() {
        MongoClient mongo = null;

        try {
            mongo = MongoClients.create("mongodb+srv://JoseAndres:2022104584@caso3poo.vllvafm.mongodb.net");
            System.out.println("Conexión a la base de datos exitosa.");
            System.out.println("---------------------------------------");

        } catch (Exception e) {
            System.err.println("Error en la conexión a la base de datos: " + e.getMessage());
            
        }

        return mongo;
    }

    public void insertarDocumento(MongoClient mongoClient, String baseDeDatos, String coleccion, String documentoJSON) {
        try {
            MongoDatabase database = mongoClient.getDatabase(baseDeDatos);
            MongoCollection<Document> collection = database.getCollection(coleccion);

            Document doc = Document.parse(documentoJSON);

            collection.insertOne(doc);

            System.out.println("---------------------------------------");
            System.out.println("Documento JSON insertado con éxito en la colección " + coleccion);
        } catch (Exception e) {
            System.out.println("---------------------------------------");
            System.err.println("Error al insertar el documento JSON: " + e.getMessage());
        }
    }
    
        public void leerDocumentos(MongoClient mongoClient, String baseDeDatos, String coleccion) {
        try {
            MongoDatabase database = mongoClient.getDatabase(baseDeDatos);
            MongoCollection<Document> collection = database.getCollection(coleccion);

            FindIterable<Document> documents = collection.find();
           
            for (Document document : documents) {
                System.out.println(document.toJson());
            }
        } catch (Exception e) {
            System.err.println("Error al leer documentos: " + e.getMessage());
        }
    }
}  
   



