
public class Recurso {
	private int contador;
	
	public Recurso() {
		contador = 0;
	}
	
	public synchronized void aumentar(String Nombre) {
		contador = contador +1;
		System.out.println("Nombre: "+Thread.currentThread().getName()+" "+Nombre+" numero de arbol sembrado = "+contador);
	}
}
