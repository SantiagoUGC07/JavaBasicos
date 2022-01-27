package Ejercicio1_par_impar;

import java.util.Scanner;

public class Par_Impar {
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar el numero del valor: ");
		int numeroEvaluar = sc.nextInt();
		sc.close();
		String resultado = (numeroEvaluar % 2 == 0)? "Es par" : "Es impar";
		System.out.println(resultado);
		 
	}

}
