import java.util.Scanner;
public class SueldoEmpleado {

	private Scanner teclado;
	private String nombre;
	private int sueldo;

	public void inicializar() {
		
		teclado=new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre=teclado.next();
		System.out.println("Ingrese sueldo: ");
		sueldo=teclado.nextInt();
	}
	
	public void imprimir() {
		
		System.out.println("Nombre:" + nombre);
		System.out.println("Sueldo:" + sueldo);
	}
	
	public void Impuesto() {
		
		if(sueldo > 3000) {
			System.out.println("Su sueldo es de" +sueldo);
			System.out.println("Debe pagar impuestos");
		}
	}
	
public static void main(String ar[]) {
	
	Empleado Empleado1;
	Empleado1 = new Empleado();
	Empleado1.inicializar();
	Empleado1.imprimir();
	Empleado1.Impuesto();
	
	}

}