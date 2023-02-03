
public class Hilo1 extends Thread{
	private Recurso contar;
	private String nombre;
	
	public Hilo1(Recurso contar, String nombre1) {
		this.contar = contar;
		this.nombre = nombre1;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			contar.aumentar(nombre);
		}
	}
}
