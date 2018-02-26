
package contornosreloj;
import java.awt.Toolkit;
import java.util.TimerTask;
import java.util.Timer;

/**
 * Aplicación de un reloj digital con alarma.
 * En la clase principal se llama a la interfaz, se gestiona la alarma y se incluye una InnerClass para gestionar el reloj en segundo plano.
 * @author dani
 */
public class ContornosReloj{
    Timer timer;
    String hora;
    /**
     * Clase main dónde se instancian el reloj y la alarma, se muestra la hora de ambos y se lanza la alarma
     * @param args
     * @throws InterruptedException 
     */
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
            
            if(Reloj.horacompleta.equals(Alarma.getHoracompleta())&&Alarma.activada==true){
                System.out.println("Alarma");
                toolkit.beep();
                Thread.sleep(1000);
            } 
        }
    }
    /**
     * Constructor de la clase principal para lanzar el TimerTask.
     */
    public ContornosReloj(){
        timer=new Timer();
        timer.schedule(new TicTac(), 0, 1000);
    }
    /**
     * Clase que se ejecuta en segundo plano para gestionar el incremento del reloj.
     */
    public class TicTac extends TimerTask {
        @Override
        public void run() {    
            Reloj.incrementoHora();
        }
    }
}
