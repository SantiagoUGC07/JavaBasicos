package EstructurasDeControl;

import java.util.Scanner;

//Estructuras de control nos sirven para controlar el flujo de comportamiento de un programa. para la toma de decisiones

/*
 switch
 */

//Solicitar al usuario un dia de la seman y mostrar el mensaje
public class EstructurasDeControlSwitch 
{
	public static void main(String[] args)
	{
		System.out.println("Introduce un dia de la semana y recibe un bonito mensaje. :-");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		
		switch(dia.toLowerCase())
		{
			case "lunes":
			{
				System.out.println("Ya mero es viernes, toma un cafe");
				break;
			}
			case "martes":
			{
				System.out.println("Lunes chiquito. Esto esta cansado, ");
				break;
			}
			case "miercoles":
			{
				System.out.println("Miercoles per a que costo");
				break;
			}
			case "jueves":
			{
				System.out.println("Juebebes de sed peligrosa");
				break;
			}
			case "viernes":
			{
				System.out.println("ya es viernes y el cuerpo lo sabe");
				break;
			}
			default:
			{
				System.out.println("Dia desconocido, Kha");
				break;
			}
			
		}
	}

}

