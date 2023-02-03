package solucion3;

public class Hilo2Alt extends Thread{
	private RecursoAlternado contar;
	private String Nombre;
	
	public Hilo2Alt(RecursoAlternado contar, String Nombre) {
		this.contar = contar;
		this.Nombre = Nombre;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			contar.aumentarHilo2(Nombre);
		}
	}
}
