package solucion2;

public class Hilo2Comunicado extends Thread{
	private Recurso contar;
	private String nombre;
	
	public Hilo2Comunicado(Recurso contar, String nombre1) {
		this.contar = contar;
		this.nombre = nombre1;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			contar.aumentar(nombre);
		}
	}
}
