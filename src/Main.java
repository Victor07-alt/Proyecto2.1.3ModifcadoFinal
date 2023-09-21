
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Totto
 */
public class Main {
    
    public static void main(String[] args) {
    ArrayList<Empresa> listaEventos = new ArrayList<>();     
    Evento evento3 = new Evento(015,new Date(2023, 8, 15), "8:00 AM", "17:00 PM","Blanco 142: ", 400000, 500, "cumpleaños", 'S');
        
    Evento evento2 = new Evento(015,new Date(2023, 6, 5), "8:00 AM", "17:00 PM","Blanco 142: ", 500000, 800, "matrimonio", 'S');
    Evento evento1 = new Evento(015,new Date(2023, 10, 5), "8:00 AM", "17:00 PM","Blanco 142: ", 500000, 800, "matrimonio", 'N');
        
    Empresa empresa=new Empresa();
       
    empresa.agregarEvento(evento1);
    empresa.agregarEvento(evento2);
    empresa.agregarEvento(evento3);
        
    listaEventos.add(empresa);    
        
        
    empresa.listarFechaEventos();  
    
    empresa.eventoMasSolicitado();
    empresa.calcularTotalVentaTipoEvento();   
    }
  
    
}
