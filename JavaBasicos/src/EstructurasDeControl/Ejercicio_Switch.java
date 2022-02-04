package EstructurasDeControl;
/*
 * Pedir al usuario 2 números por consola y preguntarle que desea realizar
 * 1) Suma
 * 2) Resta
 * 3) División
 * 4) Multiplicación
 * 
 * y despues imprimir el resultado
 */
import java.util.Scanner;

public class Ejercicio_Switch 
{
	public static void main(String[] args)
	{
		float a=0, b=0, c=0;
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) División");
		System.out.println("4) Multiplicación");
		System.out.println("Digite su opcion: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		System.out.println("Introduce valor numero1: ");
		Scanner sc1 = new Scanner(System.in);
		a = sc1.nextInt();
		System.out.println("Introduce valor numero2: ");
		Scanner sc2 = new Scanner(System.in);
		b = sc2.nextInt();
		
		
		switch(numero)
		{
			case 1:
			{
				c = a + b;
				System.out.println("El resultado de la suma de "+ a + " y " + b + " es: " + c);
				break;
			}
			case 2:
			{
				c = a - b;
				System.out.println("El resultado de la resta de "+ a + " y " + b + " es: " + c);
				break;
			}
			case 3:
			{
				c = a / b;
				System.out.println("El resultado de la division de "+ a + " y " + b + " es: " + c);
				break;
			}
			case 4:
			{
				c = a * b;
				System.out.println("El resultado de la multiplicacion de "+ a + " y " + b + " es: " + c);
				break;
			}
			default:
			{
				System.out.println("El digito no esta dentro de las opciones");
				break;
			}
			
		}
	}
}
