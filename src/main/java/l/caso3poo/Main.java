package l.caso3poo;
import com.mongodb.client.MongoClient;

public class Main {
    public static void main(String[] args) {
        // Obtiene una instancia de MongoClient (debes conectar a MongoDB previamente)
        MongoClient mongoClient = ConexionMongoDB.getInstance();

        // Crea una instancia de ParticipanteRepository para agregar ejemplos de participantes
        ParticipanteRepository participanteRepository = ParticipanteRepository.getInstance(mongoClient);

        // Crea una instancia de EventoRepository para agregar ejemplos de eventos
        EventoRepository eventoRepository = EventoRepository.getInstance(mongoClient);

        // Ejemplos de participantes
        
        Evento evento1 = new Evento();
        evento1.setNombre("Evento 1");
        evento1.setUbicacion("Ubicación 1");
        evento1.setFecha(20231104);
        evento1.setHora(1800);
        evento1.setHoraFinal(2100);
        evento1.setCapacidad(100);

        Evento evento2 = new Evento();
        evento2.setNombre("Evento 2");
        evento2.setUbicacion("Ubicación 2");
        evento2.setFecha(20231105);
        evento2.setHora(1900);
        evento2.setHoraFinal(2200);
        evento2.setCapacidad(150);

        Participante participante1 = new Participante();
        participante1.setEvento("Evento 1");
        participante1.setProducto("Producto 1");
        participante1.setCantidad(3);
        participante1.setPrecio(19.99);
        participante1.setCedula(123456789);
        participante1.setTelefono(55555555);

        Participante participante2 = new Participante();
        participante2.setEvento("Evento 2");
        participante2.setProducto("Producto 2");
        participante2.setCantidad(2);
        participante2.setPrecio(14.99);
        participante2.setCedula(987654321);
        participante2.setTelefono(66666666);

        // Agrega  a la colección
        eventoRepository.agregarEvento(evento1);
        eventoRepository.agregarEvento(evento2);
        participanteRepository.agregarParticipante(participante1);
        participanteRepository.agregarParticipante(participante2);

        System.out.println("Participantes insertados en la base de datos.");
        System.out.println("Eventos insertados en la base de datos.");

    }
}
