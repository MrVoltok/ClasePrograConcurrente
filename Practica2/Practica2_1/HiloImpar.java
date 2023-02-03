
public class HiloImpar implements Runnable{ // extends Thread
	private Recurso_Compartido contador;
	private String Nombre;
	
	public HiloImpar(Recurso_Compartido contador, String Nombre) {
		this.contador = contador;
		this.Nombre = Nombre;
	}
	
	public void run() {
		for(int i=0;i<=10;i++) {
			contador.impares(Nombre);
		}
		contador.resultadoimPar(Nombre);;
	}
}
