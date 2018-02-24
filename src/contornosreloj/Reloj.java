/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornosreloj;

import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author dani
 */
public class Reloj{
    static Date hora;
    static int horas,minutos,segundos;
    static String horacompleta=horas+":"+minutos;

    public Reloj(){
        hora = new Date();
        horas=hora.getHours();
        minutos=hora.getMinutes();
        segundos=hora.getSeconds();
    }

    public static int getHoras(){
        return horas;
    }

    public static void masHoras(int horas){
        Reloj.horas++;
    }

    public static int getMinutos(){
        return minutos;
    }

    public static void masMinutos(int minutos){
        Reloj.minutos++;
    }

    public static String getHoracompleta(){
        return horacompleta;
    }
    
    public static void incrementoHora(){
        if(segundos<60)
            segundos++;
        else if(segundos==60){
            segundos=0;
            if(minutos<60)
                minutos++;
            else if(minutos==60){
                minutos=0;
                if(horas<24){
                    horas++;
                }else
                    horas=0;
            }
        
        }
         horacompleta=horas+":"+minutos;   
    }
    
    
}
