package l.caso3poo;

public class Evento {
	private String nombre;
	private String ubicacion;
	private int fecha;
	private int hora;
	private int horaFinal;
    private int capacidad;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getUbicacion(){
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    public int getFecha() {
        return fecha;
    }
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    
    public int getHoraFinal() {
        return horaFinal;
    }
    public void setHoraFinal(int horaF) {
        this.horaFinal = horaF;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}