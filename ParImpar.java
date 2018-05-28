import java.util.Scanner;


public class ParImpar {

	public static void main(String ar[]) {
		
		int num;
	
		int pares = 0;
		
		int impares = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print("Ingrese un numero");
			
			num = teclado.nextInt();
			
			if(num % 2 == 0) {
				
				pares = pares + 1; 
					
					
				}else {
					
				impares = impares + 1;	
					
				}
			
			
			
		}
		
		
				
		System.out.print("La cantidad de numeros pares son: ");
		
		System.out.print(pares);
		
		System.out.print("La cantidad de numeros impares son: ");
		
		System.out.print(impares);
		
	
	}
	
	
}
