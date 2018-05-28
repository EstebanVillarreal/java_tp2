import java.util.Scanner;

public class CantNumero {

	public static void main(String ar[]) {
		
		System.out.print("Ingrese un numero positivo");
		
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		num = teclado.nextInt();
		
		if(num < 10) {
			
			System.out.print("El numero ingresado es de un digito" );
			
		}else if(num > 10 && num < 100) {
			
			System.out.print("El numero ingresado es de dos digitos");
			
		}else {
			
			System.out.print("El numero ingresado es de mas de dos digitos");
			
		}
		
		
	}
	
	
	
}
