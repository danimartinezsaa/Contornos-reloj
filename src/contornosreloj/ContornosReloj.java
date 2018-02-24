/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornosreloj;

import java.awt.Toolkit;
import java.util.TimerTask;
import java.util.Timer;

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
        
        while(encendido==true){
            Interfaz.mostrarHora(Reloj.getHoracompleta());
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
            
            
            
        }
    }
}
