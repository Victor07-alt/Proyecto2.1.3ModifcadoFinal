import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Totto
 */
public class Empresa {
private Evento evento;
private ArrayList <Evento> listadeEventos;


    public Empresa() {
        listadeEventos = new ArrayList<>();
        
    }


public boolean agregarEvento(Evento evento){
return listadeEventos.add(evento);}    
    
    
public void listarFechaEventos(){
List<Date> listaFechas = new ArrayList<>();
for (Evento evento : listadeEventos) {
    listaFechas.add(evento.getFechaEvento());
      }
//SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
//// String fechaMostrar = sdf.format(listaFechas);
//Collections.sort(listaFechas);
////System.out.println(fechaFormat);  
//  System.out.println(listaFechas); 
// for (Date fecha : listaFechas) {
//            String fechaFormat = sdf.format(fecha);
//            System.out.println("Fechas Ocupada: ");
//            System.out.println(fechaFormat);
//}

 int n = listaFechas.size();
        int i = 0;

        while (i < n) {
            int j = i + 1;

            while (j < n) {
                if (listaFechas.get(i).after(listaFechas.get(j))) {
                    // Intercambia las fechas
                    Date temp = listaFechas.get(i);
                    listaFechas.set(i, listaFechas.get(j));
                    listaFechas.set(j, temp);
                }
                j++;
            }
            i++;
        }
    SimpleDateFormat sdf = new SimpleDateFormat("yy-MMM-dd");
    System.out.println("Fechas Ocupadas ordenadas :");
    for (Date fecha : listaFechas) {
        String fechaFormat = sdf.format(fecha);
        System.out.println(fechaFormat);
    }    
}

Scanner leer = new Scanner(System.in);
   

    public double calcularTotalVentaTipoEvento() {
    double totalVentas = 0;
    System.out.println("Ingrese el tipo de evento que desea calcular su total de ventas: ");
    String tipo = leer.next();
    for (Evento tipoEvento : listadeEventos) {
        if (tipoEvento.getTipoEvento().equalsIgnoreCase(tipo)) {
            totalVentas += tipoEvento.getPrecio();
        }
    }System.out.println("Total Ventas:  "+totalVentas );
    return totalVentas;
        
    }
    
    public void eventoMasSolicitado(){
      int sumaTotalEventoCumple,sumaTotalEventoMatrimonio,sumaTotalEventoCena,sumaTotalEventofiesta;
      sumaTotalEventoCumple=0;
      sumaTotalEventoMatrimonio=0;
      sumaTotalEventoCena=0;
      sumaTotalEventofiesta=0;
      for (Evento evento : listadeEventos) {
          if ("cumpleaños".equals(evento.getTipoEvento())){
              sumaTotalEventoCumple+=1;
          }
          
          if ("matrimonio".equals(evento.getTipoEvento())){
              sumaTotalEventoMatrimonio+=1;
          }
          
          if ("cena".equals(evento.getTipoEvento())){
              sumaTotalEventoCena+=1;
          }
          
          if ("fiesta".equals(evento.getTipoEvento())){
              sumaTotalEventofiesta+=1;
          }

      }
        System.out.println("");
        System.out.println("****Lista de eventos Mas solicitados: ***");
      System.out.println("Total de eventos Cumpleaños: "+sumaTotalEventoCumple);
      System.out.println("Total de eventos Matrimonios: "+sumaTotalEventoMatrimonio);
      System.out.println("Total de eventos Cena: "+sumaTotalEventoCena);
      System.out.println("Total de eventos Fiesta: "+sumaTotalEventofiesta);
      System.out.println("");
      System.out.println("");
  }
}










