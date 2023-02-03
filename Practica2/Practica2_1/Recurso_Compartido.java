
public class Recurso_Compartido {
	private int contador;
	private boolean entrada = true;
	private int sumaP = 0;
	private int sumaImp = 0;
	
	public Recurso_Compartido() {
		contador = 0;
	}
	
	public synchronized void pares(String Nombre) {
		while(entrada == false) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		
		if((contador%2) == 0) {
			System.out.println("Nombre: "+Thread.currentThread().getName()+Nombre+" numero es par   = "+contador);
		}
		
		sumaP += contador;
		contador = contador+1;
		
		entrada = false;
		notify();
	}
	
	public synchronized void impares(String Nombre) {
		while(entrada == true) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		
		if((contador%2) != 0) {
			System.out.println("Nombre: "+Thread.currentThread().getName()+Nombre+" numero es impar = "+contador);
		}
		
		sumaImp += contador;
		contador = contador+1;
		
		entrada = true;
		notify();
	}
	
	public void resultadoPar(String Nombre) {
		System.out.println("Nombre: "+Thread.currentThread().getName()+Nombre+" Total de pares = "+sumaP);
	}
	
	public void resultadoimPar(String Nombre) {
		System.out.println("Nombre: "+Thread.currentThread().getName()+Nombre+" Total de impares = "+sumaImp);
	}
}
