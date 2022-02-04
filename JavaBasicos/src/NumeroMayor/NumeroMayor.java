package NumeroMayor;

import java.util.Scanner;

public class NumeroMayor 
{

	public static void main(String[] args)
	{
		System.out.println("Introduce num1: ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("Introduce num2: ");
		Scanner scanner1 = new Scanner(System.in);
		int num2 = scanner1.nextInt();
		System.out.println("Introduce num3: ");
		Scanner scanner2 = new Scanner(System.in);
		int num3 = scanner2.nextInt();
		
		if((num1 >= num2) && (num1 >= num3))
		{
			
			System.out.println("El numero mayor es: " + num1);
			
		}
		else if((num2 >= num1) && (num2 >= num3))
		{
			System.out.println("El numero mayor es: " + num2);
		}
		else if((num3 >= num1) && (num3 >= num2))
		{
			System.out.println("El numero mayor es: " + num3);
		}
		else if((num1 == num3) && (num1 == num2))
		{
			System.out.println("los numero ingresados son iguales: ");
		}
	}

}
