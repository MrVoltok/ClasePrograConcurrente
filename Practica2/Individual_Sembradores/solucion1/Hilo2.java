
public class Hilo2 extends Thread{
	private Recurso contar;
	private String nombre;
	
	public Hilo2(Recurso contar, String nombre) {
		this.contar = contar;
		this.nombre = nombre;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			contar.aumentar(nombre);
		}
	}
}
