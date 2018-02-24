/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornosreloj;

import static contornosreloj.Reloj.hora;
import java.util.Date;

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
        hora = new Date();
        horas=hora.getHours();
        minutos=hora.getMinutes();
        segundos=hora.getSeconds();
    }

    public static int getHoras(){
        return horas;
    }

    public static void IncrementarHoras(int horas){
        Alarma.horas++;
    }

    public static int getMinutos(){
        return minutos;
    }

    public static void incrementarMinutos(int minutos){
        Alarma.minutos++;
    }

    public static String getHoracompleta(){
        return horacompleta;
    }   
}
