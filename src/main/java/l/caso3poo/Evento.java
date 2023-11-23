package l.caso3poo;

import java.util.Date;

public class Evento {

    private String ubicacion;
    private Date fecha;
    private Date hora;
    private Date horaFinal;
    private int capacidad;

    public Evento(String ubicacion, Date dia, Date horaInicio, Date horaFin, int capacidad) {
        this.ubicacion = ubicacion;
        this.fecha = dia;
        this.hora = horaInicio;
        this.horaFinal = horaFin;
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date setFecha(Date fecha) {
        this.fecha = fecha;
        return null;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaF) {
        this.horaFinal = horaF;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
