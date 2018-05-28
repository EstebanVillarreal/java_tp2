import java.util.Scanner;


public class IngresoNumero {

public static void main(String ar[]) {
		
		int num = 0; 
		
		int cant = 0;
		
		while(num != 9999) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese numero");
		
		num = teclado.nextInt();
		
		if(num != 9999) {
			
			cant = num + cant;
		}
		
		}
			
		System.out.print("Finalizo la carga\n");
		
		if(cant == 0) {
		
		System.out.print( " es cero: " + cant);
		
		}else if(cant < 0) {
			
			System.out.print(cant + " es menor a cero");
			
		}else {
			
			System.out.print(cant + " es mayor a cero");
			
		}
		
	}

}
