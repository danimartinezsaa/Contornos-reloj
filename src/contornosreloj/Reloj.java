
package contornosreloj;

import java.util.Date;

/**
 * Clase que gestiona el Reloj, inicializa e incrementa el valor de tiempo.
 * @author dani
 */
public class Reloj{
    static Date hora;
    static int horas,minutos,segundos;
    static String horacompleta=horas+":"+minutos;
/**
 * Contructor que recoje el tiempo del sistema.
 */
    public Reloj(){
        hora = new Date();
        horas=hora.getHours();
        minutos=hora.getMinutes();
        segundos=hora.getSeconds();
    }
/**
 * Incrementa en 1 la hora.
 */
    public static void masHoras(){
        if(horas<23)
            Reloj.horas++;
        else
            Reloj.horas=0;
    }

/**
 * Incrementa en 1 los minutos.
 */
    public static void masMinutos(){
        if(minutos<59)
            Reloj.minutos++;
        else{
            Reloj.minutos=0;
            if(horas<23)
                Reloj.horas++;
            else
                Reloj.horas=0;
        }
    }
/**
 * Incrementa el tiempo del reloj.
 */
    public static void incrementoHora(){
        if(segundos<59)
            segundos++;
        else if(segundos<=60){
            segundos=0;
            if(minutos<59)
                minutos++;
            else if(minutos<=60){
                minutos=0;
                if(horas<23){
                    horas++;
                }else
                    horas=0;
            }
        
        }
        horacompleta=horas+":"+minutos;   
    } 
}
