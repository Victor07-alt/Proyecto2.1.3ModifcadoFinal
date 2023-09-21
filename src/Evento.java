
import java.util.Date;

/**
 *
 * @author Totto
 */
public class Evento implements Comparable<Evento>{
    
    private int codigoEvento;
    private Date fechaEvento;
    private String horaInicio;
    private String horaTermino;
    private String ubicacion;
    private int precio;
    private int cantidadPersonas;
    private String tipoEvento;
    private char    servivioEntretencion;

    public Evento() {
    }

    public Evento(int codigoEvento, Date fechaEvento, String horaInicio, String horaTermino, String ubicacion, int precio, int cantidadPersonas, String tipoEvento, char servivioEntretencion) {
        this.codigoEvento = codigoEvento;
        this.fechaEvento = fechaEvento;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoEvento = tipoEvento;
        this.servivioEntretencion = servivioEntretencion;
    }

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public char getServivioEntretencion() {
        return servivioEntretencion;
    }

    public void setServivioEntretencion(char servivioEntretencion) {
        this.servivioEntretencion = servivioEntretencion;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigoEvento=" + codigoEvento + ", fechaEvento=" + fechaEvento + ", horaInicio=" + horaInicio + ", horaTermino=" + horaTermino + ", ubicacion=" + ubicacion + ", precio=" + precio + ", cantidadPersonas=" + cantidadPersonas + ", tipoEvento=" + tipoEvento + ", servivioEntretencion=" + servivioEntretencion + '}';
    }

    @Override
    public int compareTo(Evento o) {
      return fechaEvento.compareTo(this.getFechaEvento());
    }
    
    
    
    
    
}
