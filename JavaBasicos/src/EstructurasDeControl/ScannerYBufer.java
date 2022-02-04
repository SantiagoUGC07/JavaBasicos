package EstructurasDeControl;

import java.util.Scanner;

public class ScannerYBufer 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce un numero");
		int numero = sc.nextInt();
		
		System.out.println("Tu nombre es: " +nombre+ "Tu numero es: " +numero+ "");
		
	}

}
