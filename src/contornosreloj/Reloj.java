/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornosreloj;

import java.util.Date;

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

    public static void masHoras(){
        if(horas<23)
            Reloj.horas++;
        else
            Reloj.horas=0;
    }

    public static int getMinutos(){
        return minutos;
    }

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

    public static String getHoracompleta(){
        return horacompleta;
    }
    
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
