package p1_3;
public class Practica1_3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inicio de los hilos con interfaz\n");
        //se crean hilos con la interfaz runneable
        HiloInterfazA A= new HiloInterfazA(" A: Impares ");
        HiloInterfazB B= new HiloInterfazB(" B: Pares ");
        //se crean hilos que utilizan los objetos
        Thread hiloA= new Thread(A);
        Thread hiloB =new Thread(B);
        //se inicia el hilo A
        hiloA.start();
        //Sincronizando los hilos a partir de sleep (No ejecucion durante X tiempo) (Aplicado a su vez en los run)
        try {
                hiloA.sleep(100);
            } 
        catch (InterruptedException ex) {
            System.out.println("Error en hilo A");
        }
        //Se inicia el Hilo B
        hiloB.start();
        //Sincronizando los hilos a partir de sleep (No ejecucion durante X tiempo) (Aplicado a su vez en los run)
        try {
                hiloB.sleep(100);
            } 
        catch (InterruptedException ex) {
            System.out.println("Error en hilo B");
        }
    }
}

