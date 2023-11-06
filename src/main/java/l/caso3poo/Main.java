
package l.caso3poo;
import com.mongodb.client.MongoClient;

public class Main {
    public static void main(String[] args) {
        Conectar obtener = new Conectar();
        MongoClient cliente;
        cliente = obtener.CrearConexion();
        String baseDeDatos = "Caso3POO";
        String coleccion = "Proyecto";
        //String documentoJSON = "{ \"Camisas\": \"42\", \"arroz\": \"20\" }";

        //obtener.insertarDocumento(cliente, baseDeDatos, coleccion, documentoJSON);
        
        obtener.leerDocumentos(cliente, baseDeDatos, coleccion);
        
        // Cierra la conexión cuando hayas terminado
       cliente.close();
    }
}


