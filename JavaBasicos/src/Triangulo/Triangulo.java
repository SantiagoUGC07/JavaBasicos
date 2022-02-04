package Triangulo;

import java.util.Scanner;

public class Triangulo 
{
	public static void main(String[] args)
	{
		System.out.println("Introduce ang1: ");
		Scanner scanner = new Scanner(System.in);
		int ang1 = scanner.nextInt();
		System.out.println("Introduce ang2: ");
		Scanner scanner1 = new Scanner(System.in);
		int ang2 = scanner1.nextInt();
		System.out.println("Introduce ang3: ");
		Scanner scanner2 = new Scanner(System.in);
		int ang3 = scanner2.nextInt();
		int trianguloResultado = ang1 + ang2 + ang3;
		String resultado = (trianguloResultado == 180)? "es triangulo" : "no es triangulo" ;
		System.out.println(resultado);
	}
}
