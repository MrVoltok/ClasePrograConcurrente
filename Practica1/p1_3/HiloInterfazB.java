package p1_3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloInterfazB implements Runnable{
    private String nombre;
    public HiloInterfazB(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void run() {
        for (int i = 2; i <11; i++) {
            //Se hara impresion unicamente de los numeros pares
            if(i % 2 ==0){
                System.out.println("Este es el hilo"+nombre+" con el numero "+i);
            }
            /*En caso de ser un numero impar, se hara una espera para la sincronizacion
              de la impresion con el hilo A*/
            else{
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(HiloInterfazB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}