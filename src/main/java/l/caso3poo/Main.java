package l.caso3poo;

import Interfaces.MenuPrincipal;
import com.mongodb.client.MongoClient;

public class Main {

    public static void main(String[] args) {
        // Obtiene una instancia de MongoClient (debes conectar a MongoDB previamente)
        MongoClient mongoClient = ConexionMongoDB.getInstance();
        System.out.println("Conexión establecida con MongoDB Atlas");

        // Crea una instancia de ParticipanteRepository para agregar ejemplos de participantes
        ParticipanteRepository participanteRepository = ParticipanteRepository.getInstance(mongoClient);

        // Crea una instancia de EventoRepository para agregar ejemplos de eventos
        EventoRepository eventoRepository = EventoRepository.getInstance(mongoClient);

         MenuPrincipal venta = new MenuPrincipal();
    }

}
