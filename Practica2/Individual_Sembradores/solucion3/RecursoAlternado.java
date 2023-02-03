package solucion3;

public class RecursoAlternado {
	private int contador;
	private boolean entrada = true;
	
	public RecursoAlternado() {
		contador = 0;
	}
	public synchronized void aumentarHilo1(String Nombre) {
		while(entrada == false) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		
		contador = contador + 1;
		System.out.println("Nombre: "+Thread.currentThread().getName()+" "+Nombre+" numero de arbol sembrado = "+contador);
		entrada = false;
		notify();
	}
	
	public synchronized void aumentarHilo2(String Nombre) {
		while(entrada == true) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		
		contador = contador + 1;
		System.out.println("Nombre: "+Thread.currentThread().getName()+" "+Nombre+" numero de arbol sembrado = "+contador);
		entrada = true;
		notify();
	}
}
