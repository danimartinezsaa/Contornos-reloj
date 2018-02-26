
package contornosreloj;

/**
 *Clase que gestiona la hora de la alarma.
 * @author dani
 */
public class Alarma{
    public static final String indicador="A";
    public static boolean activada=false;
    
    static int horas,minutos,segundos;
    static String horacompleta=horas+":"+minutos;
/**
 * Contructor que inicializa la hora de la alarma a la hora del reloj.
 */
    public Alarma(){
        horas=Reloj.horas;
        minutos=Reloj.minutos;
        segundos=Reloj.segundos;
        horacompleta=horas+":"+minutos;
        
    }
/**
 * Método que incrementa el número de la hora.
 */
    public static void IncrementarHoras(){
        if(horas<23)
            Alarma.horas++;
        else
            Alarma.horas=0;
    }
/**
 * Método que incrementa el número de los mimutos.
 */
    public static void incrementarMinutos(){
        if(minutos<59)
            Alarma.minutos++;
        else{
            Alarma.minutos=0;
            if(horas<23)
                Alarma.horas++;
            else
                Alarma.horas=0;
        }
    }
/**
 * Método que devuelve la hora completa
 * @return Hora completa.
 */
    public static String getHoracompleta(){
        return horas+":"+minutos;
    }   
}
