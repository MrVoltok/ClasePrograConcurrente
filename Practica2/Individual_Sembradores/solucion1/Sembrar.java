
public class Sembrar {

	public static void main(String[] args) {
		Recurso jardin = new Recurso();
		Hilo1 hermano1 = new Hilo1(jardin, "Hermano 1");
		Hilo2 hermano2 = new Hilo2(jardin, "Hermano 2");
		
		hermano1.start();
		hermano2.start();

	}

}
