/**
 * @author Andrés Segura 
 * @author Andr7st
 * 
 * Ejercicio de programación JAVA.
 * - Función para obtener la hora actual del sistema en un String.
 */

package andr7st;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tiempo {

    private int hora, minuto, segundo;
    private String horaDelSistema;

    public void HoraMeridiana(){ // AM PM
         
        Calendar tiempoSistema = new GregorianCalendar();

        hora    = tiempoSistema.get(Calendar.HOUR);
        minuto  = tiempoSistema.get(Calendar.MINUTE);
        segundo = tiempoSistema.get(Calendar.SECOND);

        int am_pm = tiempoSistema.get(Calendar.AM_PM);

        
        String meridiano = "PM";
        String segCero = "";
        String minCero = "";

        
        String horaStr, minutoStr, segundoStr;
        horaStr    = String.valueOf(hora);
        minutoStr  = String.valueOf(minuto);
        segundoStr = String.valueOf(segundo);


        //// Poniendo un cero si el numero es menor a 10 
        if(minuto<10){minCero="0";}
        if(segundo<10){segCero="0";}
        if(am_pm == 0){meridiano="AM";}
        if(hora == 0){horaStr = "12";}


        this.horaDelSistema = horaStr + ":" + minCero + minutoStr + ":" + segCero + segundoStr +" "+ meridiano;
    }

    public String obtenerHora(){
        return horaDelSistema;
    }
}

// Hay formas más obtimazadas de hacerlo, este es un ejercicio de compresión.











/* 

        if (hora > 11){
            
            horaStr = String.valueOf(hora - 11); 
            meridiano = "PM";

        }
        else{meridiano = "AM";}

        

        if(hora == 0){
            horaStr = String.valueOf(12);
        }




        // anteponiendo cero para mostrar 1:07:07 en vez de 1:7:7
        if(segundo < 10){segCero = "0";}
        if(minuto < 10) {minCero = "0";} */