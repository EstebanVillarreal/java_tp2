package test;

import java.util.Scanner;

public class Personas {

	private String nombre;
	protected Scanner teclado;
	private int edad;

	public void Ingresar() {
		
		teclado=new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre=teclado.next();
		System.out.println("Ingrese edad: ");
		edad=teclado.nextInt();
	}
	
	public void imprimir() {
		
		System.out.println("Nombre:" + nombre);
		System.out.println("edad:" + edad);
	}
}

class Empleado extends Persona{
	
private int sueldo;

public void CargarSueldo() {

teclado=new Scanner(System.in);
System.out.println("Ingrese sueldo: ");
sueldo=teclado.nextInt();

} 

public void ImprimirSueldo() {

System.out.println("Sueldo:" + sueldo);

}




}