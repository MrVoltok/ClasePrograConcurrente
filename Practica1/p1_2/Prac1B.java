/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author olaxj
 */
public class Prac1B 
{
    public static void main(String[] args) throws InterruptedException {
 
    System.out.println("Inicio de los hilos con interfaz\n");

   //se crean hilos con la interfaz runnable

    Hilo1 d = new Hilo1("uno");
    Hilo1 e = new Hilo1("dos");
    Hilo1 f = new Hilo1("tres");

    //se crean hilos que utilizan los objetos

    Thread hilod = new Thread(d);
    Thread hiloe = new Thread(e);
    Thread hilof = new Thread(f);

    // Consultamos el estado del hilo
 	// Como no hemos invocado el metodo start el estado será New
 	System.out.println("Estado hilo d: "+hilod.getState());
 	System.out.println("Estado hilo e: "+hiloe.getState());
 	System.out.println("Estado hilo f: "+hilof.getState()+"\n");
 		
 		
    //se inician los hilos

    hilod.start();
    System.out.println("Estado isAlive hilo d: "+hilod.isAlive());
    hiloe.start();
    System.out.println("Estado isAlive hilo e: "+hiloe.isAlive());
    try 
    {
		hiloe.sleep(1000);
		System.out.println("Estado isAlive hilo e: "+hiloe.isAlive());
		System.out.println("Estado hilo e: "+hiloe.getState());
	}
    catch(InterruptedException e) 
    {
		System.out.println(e);
	}
    hilof.start();
    System.out.println("Estado isAlive hilo f: "+hilof.isAlive());
    


    System.out.println("Fin de los hilos por interfaz");
    }
}
