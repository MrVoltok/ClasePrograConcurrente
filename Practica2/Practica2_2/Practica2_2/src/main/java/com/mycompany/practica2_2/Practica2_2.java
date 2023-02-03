package com.mycompany.practica2_2;
import java.util.Random;
public class Practica2_2 {
    static int SumaHilo1 = 0, SumaHilo2 = 0; //Sumas de ambos hilos
    static Object Bandera = new Object(); // Bandera para verificar cambio entre hilos
    static boolean Semaforo = true;// Variable para realizar los cambios de hilo
    
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Hilo1());
        Thread hilo2 = new Thread(new Hilo2());

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        }catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("Suma del hilo 1: " + SumaHilo1);
        System.out.println("Suma del hilo 2: " + SumaHilo2);
  }
    
    static class Hilo1 implements Runnable{
        @Override
        public void run() {
            Random R = new Random();
            for (int i = 0; i < 50; i++) {
                synchronized (Bandera){// Utilizamos la bandera como "cerrojo" para la sincronizacion correcta
                    while(!Semaforo){//Comparamos si los valores del semaforo y de la bandera son los mismos para hacer esperar al hilo o ejecutar el codigo correspondiente
                        try {
                           Bandera.wait();//Hacemos que el hilo 1 espere
                        }catch (InterruptedException e){e.printStackTrace();}  
                    };
                    int N = R.nextInt(70) - 20;
                    if(N>0){
                        System.out.println("Hilo 1 --> N con Valor: "+N+" Numero Positivo");
                        SumaHilo1 = SumaHilo1 + N;
                    }
                    Semaforo = false;
                    Bandera.notifyAll();
                }
            }
        }
    }
    
    static class Hilo2 implements Runnable{
        @Override
        public void run() {
            Random R = new Random();
            for (int i = 0; i < 50; i++) {
               synchronized (Bandera){// Utilizamos la bandera como "cerrojo" para la sincronizacion correcta
                    while(Semaforo){//Comparamos si los valores del semaforo y de la bandera son los mismos para hacer esperar al hilo o ejecutar el codigo correspondiente
                        try {
                           Bandera.wait();//Hacemos que el hilo 1 espere
                        }catch (InterruptedException e){e.printStackTrace();}  
                    };
                int N = R.nextInt(70) - 20;
                if(N>0){
                    System.out.println("Hilo 2 --> N con Valor: "+N+" Numero POSITIVO");
                    SumaHilo2 = SumaHilo2 + N;
                }
                Semaforo = true;
                Bandera.notifyAll();
                }
            }
        }
    }
}
