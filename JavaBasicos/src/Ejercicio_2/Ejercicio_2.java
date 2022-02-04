// solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
		// sila cuenta es de 1001 - 4999 10%
		// si la cuenta es de 5001 a 9999 20%
		// si la copra es de 10000 o más 30%
// imprimir el total con los descuentos incluidos

package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 
{
	public static void main(String[] args)
	{
		float des = 0, ncuenta = 0, cuenta = 0; 
		System.out.println("Ingresa la cantidad: ");
		Scanner scanner = new Scanner(System.in);
		cuenta = scanner.nextInt();
		
		if((cuenta <= 1000) && (cuenta < 5000))
		{
			System.out.println(cuenta);
		}
		else if((cuenta > 1000) && (cuenta < 5000))
		{
			des = (float) (cuenta * 0.10);
			ncuenta = (float) (cuenta *  0.90);
			System.out.println("tu cuenta es de: " + cuenta);
			System.out.println("el descuento es de: " + des);
			System.out.println("total es: " + ncuenta);
		}
		else if((cuenta > 5000) && (cuenta < 10000))
		{
			des = (float) (cuenta * 0.20);
			ncuenta = (float) (cuenta *  0.90);
			System.out.println("tu cuenta es de: " + cuenta);
			System.out.println("el descuento es de: " + des);
			System.out.println("total es: " + ncuenta);
		}
		else if(cuenta > 10000)
		{
			des = (float) (cuenta * 0.30);
			ncuenta = (float) (cuenta *  0.90);
			System.out.println("tu cuenta es de: " + cuenta);
			System.out.println("el descuento es de: " + des);
			System.out.println("total es: " + ncuenta);
		}
	}

}
