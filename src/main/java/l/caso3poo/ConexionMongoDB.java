package l.caso3poo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class ConexionMongoDB {
    private static MongoClient mongoClient;

    private ConexionMongoDB() {
        // Reemplaza la cadena de conexión con la de tu clúster en MongoDB Atlas.
        mongoClient = MongoClients.create("mongodb+srv://lordpablito:pablito96@cluster0.e6vs5ed.mongodb.net/test?retryWrites=true&w=majority");
    }

    public static MongoClient getInstance() {
        if (mongoClient == null) {
            new ConexionMongoDB();
        }
        return mongoClient;
    }
}