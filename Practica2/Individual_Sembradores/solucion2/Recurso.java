package solucion2;

public class Recurso {
	private int contador;
	private boolean entrada = true;
	
	public Recurso() {
		contador = 0;
	}
	
	public synchronized void aumentar(String Nombre) {
		while (entrada == false) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		
		contador = contador +1;
		System.out.println("Nombre: "+Thread.currentThread().getName()+" "+Nombre+" numero de arbol sembrado = "+contador);
		entrada = true;
		notify();
	}
}
