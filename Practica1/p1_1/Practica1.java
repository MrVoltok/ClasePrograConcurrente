
public class Practica1 {

	public static void main(String[] args) {
		
		// Estados en los hilos
		
		//Creacion de los hilos
		HiloHerencia a = new HiloHerencia();
		HiloHerencia b = new HiloHerencia();
		HiloHerencia c = new HiloHerencia();
		
		// Consultamos el estado del hilo
		// Como no hemos invocado el metodo start el estado será New
		System.out.println("Estado hilo a: "+a.getState());
		System.out.println("Estado hilo b: "+b.getState());
		System.out.println("Estado hilo c: "+c.getState()+ "\n");
		
		// Consultamos si los hilos estan vivos o muertos
		a.start();
		System.out.println("Estado isAlive hilo a: "+a.isAlive());

		b.start();
		
		//Al terminar el proceso del hilo b, dormimos por 1 segundo
		try {
			b.sleep(1000);
			System.out.println("Estado isAlive hilo b: "+b.isAlive());
			System.out.println("Estado hilo b: "+b.getState());
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		c.start();
		System.out.println("Estado isAlive hilo c: "+c.isAlive());
	}

}