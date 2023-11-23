package l.caso3poo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ParticipanteRepository {

    private static ParticipanteRepository instance;
    private final MongoCollection<Document> participanteCollection;

    private ParticipanteRepository(MongoClient mongoClient) {
        MongoDatabase database = mongoClient.getDatabase("myDatabase");
        participanteCollection = database.getCollection("Participantes");
    }

    public static ParticipanteRepository getInstance(MongoClient mongoClient) {
        if (instance == null) {
            instance = new ParticipanteRepository(mongoClient);
        }
        return instance;
    }

    public void agregarParticipante(Participante participante) {
        Document participanteDocument = new Document()
                .append("evento", participante.getEvento())
                .append("producto", participante.getProducto())
                .append("cantidad", participante.getCantidad())
                .append("precio", participante.getPrecio())
                .append("cedula", participante.getCedula())
                .append("telefono", participante.getTelefono());
        participanteCollection.insertOne(participanteDocument);
    }

    public void eliminarParticipante(int cedula) {
        //participanteCollection.deleteOne(new Document("cedula", new ObjectId(cedula)));
    }

    public void modificarParticipante(int cedula, Participante participante) {
        Document participanteDocument = new Document()
                .append("evento", participante.getEvento())
                .append("producto", participante.getProducto())
                .append("cantidad", participante.getCantidad())
                .append("precio", participante.getPrecio())
                .append("cedula", participante.getCedula())
                .append("telefono", participante.getTelefono());
        //participanteCollection.replaceOne(new Document("cedula", new ObjectId(cedula)), participanteDocument);
    }
}
