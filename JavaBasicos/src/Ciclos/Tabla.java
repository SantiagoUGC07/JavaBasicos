package Ciclos;
/*
Utilizando un bucle while

1.- Crea una nueva clase llamada Tabla
2.- Copia el siguiente codigo y verifica que funcione
*/
import java.util.Scanner;

public class Tabla 
{
	public static void main(String[] args)
    {
			int num=0 , i=1;
	        Scanner console = new Scanner(System.in);
	        System.out.print("Ingresa cualquier número positivo: ");
	        num = console.nextInt();
	        if(num > 0)
	        {
		        System.out.println("Tabla de multiplicar de  " + num);
				while(i<=10)
				{             
					System.out.println(+ num + "* " + i + "= " + num * i);
			        i++;
				}
	        }else {
	        	System.out.println("el numero: " + num + " no es positivo");
	        }
       //Implementa un bucle while que imprima el resultado
    }
	//3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)
}
