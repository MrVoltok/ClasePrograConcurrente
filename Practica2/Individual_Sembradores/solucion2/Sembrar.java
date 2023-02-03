package solucion2;

public class Sembrar {

	public static void main(String[] args) {
		Recurso jardin = new Recurso();
		Hilo1Comunicado hermano1 = new Hilo1Comunicado(jardin,"Hermano 1");
		Hilo2Comunicado hermano2 = new Hilo2Comunicado(jardin,"Hermano 2");
		
		hermano1.start();
		hermano2.start();
	}

}
