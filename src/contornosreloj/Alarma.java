/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornosreloj;

/**
 *
 * @author dani
 */
public class Alarma{
    public static final String indicador="A";
    public static boolean activada=false;
    
    static int horas,minutos,segundos;
    static String horacompleta=horas+":"+minutos;

    public Alarma(){
        horas=Reloj.getHoras();
        minutos=Reloj.getMinutos();
        segundos=Reloj.segundos;
        horacompleta=horas+":"+minutos;
        
    }

    public static int getHoras(){
        return horas;
    }

    public static void IncrementarHoras(){
        if(horas<23)
            Alarma.horas++;
        else
            Alarma.horas=0;
    }

    public static int getMinutos(){
        return minutos;
    }

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

    public static String getHoracompleta(){
        return horas+":"+minutos;
    }   
}
