/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornosreloj;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author dani
 */
public class ContornosReloj{
    Timer timer;
    String hora;
    
    public static void main(String[] args) throws InterruptedException{
        boolean encendido=true;
        Interfaz ventana=new Interfaz();
        Reloj reloj=new Reloj();
        new ContornosReloj();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        while(encendido==true){
            if(Interfaz.alarma_reloj==true)
                Interfaz.mostrarHora();
            else
                Interfaz.mostrarAlarma();
            
            if(Reloj.getHoracompleta().equals(Alarma.getHoracompleta())&&Alarma.activada==true){
                System.out.println("Alarma");
                toolkit.beep();
            } 
        }
    }
    
    public ContornosReloj(){
        timer=new Timer();
        timer.schedule(new TicTac(), 0, 1000);
    }
    
    public class TicTac extends TimerTask {

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        @Override
        public void run() {    
            Reloj.incrementoHora();
            System.out.println(Reloj.getHoracompleta());
        }
    }
}
