package solucion3;

public class Sembrar {

	public static void main(String[] args) {
		RecursoAlternado jardin = new RecursoAlternado();
		Hilo1Alt Hermano1 = new Hilo1Alt(jardin,"Hermano 1");
		Hilo2Alt Hermano2 = new Hilo2Alt(jardin,"Hermano 2");
		
		Hermano1.start();
		Hermano2.start();
	}

}
