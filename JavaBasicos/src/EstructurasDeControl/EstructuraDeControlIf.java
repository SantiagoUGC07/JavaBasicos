package EstructurasDeControl;

import java.io.Serializable;
import java.util.Scanner;

public class EstructuraDeControlIf 
{
	public static void main(String[] args)
	{
		//Estructuras de control de flujo.
		//Nos sirve para toma de decisiones
		
		//Estructuras de control de flujo nos sirven para
		//cambiar el flujo de nuestro programa
		//Evaluando una condicion y apartir de la evaluacion. 
		//Se realiza una accion u otra.
		/*
		 if()
		 {}
		 else
		 {
		 }
		 */
		System.out.println("Introduce tu edad: ");
		Scanner scanner = new Scanner(System.in);
		int edad = scanner.nextInt();
		
		if(edad >= 18)
		{
			System.out.println("Eres mayor de edad: ");
			
		}
		else
		{
			System.out.println("Eres menor de edad: ");
		}
	}
	
}
