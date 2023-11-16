package l.caso3poo;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
	
public class EventoRepository {
    private static EventoRepository instance;
    private final MongoCollection<Document> eventoCollection;

    private EventoRepository(MongoClient mongoClient) {
    	MongoDatabase database = mongoClient.getDatabase("myDatabase");
        eventoCollection = database.getCollection("eventos");
    }
    
    public static EventoRepository getInstance(MongoClient mongoClient) {
        if (instance == null) {
            instance = new EventoRepository(mongoClient);
        }
        return instance;
    }

    public void agregarEvento(Evento evento) {
        Document eventoDocument = new Document()
            .append("fecha", evento.getFecha())
            .append("nombre", evento.getNombre())
            .append("hora", evento.getHora())
            .append("horaFinal", evento.getHoraFinal())
            .append("ubicacion", evento.getUbicacion())
            .append("capacidad", evento.getCapacidad());
        eventoCollection.insertOne(eventoDocument);
    }
}
