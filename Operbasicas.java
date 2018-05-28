import java.util.Scanner;

public class Operbasicas {

	private Scanner teclado;
	
	private int num1;
	
	private int num2;

	public void cargarValores() {
		
		teclado = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
		
		num1 = teclado.nextInt();
		
		System.out.print("Ingrese otro numero: ");
		
		num2 = teclado.nextInt();
		
	}
	
	public int suma() { 
		
		return(num1 + num2);
		
	}
	
	public int resta() {
		
		return(num1-num2);
		
	}
	
	public int mult() {
		
		return(num1 * num2);
		
	}
	
	public int div() {
		
		return(num1 / num2);
		
	}
	
	public static void main(String[] ar) {
		
		Operaciones Operacion;
		
		Operacion = new Operaciones();
		
		Operacion.cargarValores();
		
		System.out.print("La suma da: " + Operacion.suma());
		
		System.out.print("La resta da: " + Operacion.resta());
		
		System.out.print("La multiplicacion da: " + Operacion.mult());
		
		System.out.print("La division da: " + Operacion.div());
		
	}
	
}
