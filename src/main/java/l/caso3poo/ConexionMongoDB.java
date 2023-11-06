package l.caso3poo;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class ConexionMongoDB {
    private static MongoClient mongoClient;

    private ConexionMongoDB() {
        // Conectar a MongoDB (asegúrate de que el servidor de MongoDB esté en ejecución).
        mongoClient = MongoClients.create("mongodb://localhost:27017");
    }

    public static MongoClient getInstance() {
        if (mongoClient == null) {
            new ConexionMongoDB();
        }
        return mongoClient;
    }
}
