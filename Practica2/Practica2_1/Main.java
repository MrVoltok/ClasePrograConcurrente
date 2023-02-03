
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Recurso_Compartido contador = new Recurso_Compartido();
		HiloImpar contador1 = new HiloImpar(contador,"Hilo1");
		HiloPar contador2 = new HiloPar(contador,"Hilo2");
		
		Thread impar = new Thread(contador1);
		Thread par = new Thread(contador2);
		
		impar.start();
		par.start();
		
		impar.join();
		par.join();
	}
}
