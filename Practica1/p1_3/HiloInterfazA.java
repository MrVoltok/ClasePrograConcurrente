package p1_3
// Se implementa la interfaz runneable

import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloInterfazA implements Runnable{
    private String nombre;
    public HiloInterfazA(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            //Se hara impresion unicamente de los numeros impares
            if(i % 2 !=0){
                System.out.println("Este es el hilo"+nombre+" con el numero "+i);
            }
            /*En caso de ser un numero par, se hara una espera para la sincronizacion
              de la impresion con el hilo B*/
            else{
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HiloInterfazA.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
