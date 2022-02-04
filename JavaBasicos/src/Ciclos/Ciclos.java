package Ciclos;

public class Ciclos 
{
	public static void main(String[] args)
	{
		int control = 0;
		//while
		/*
		while(control < 10)
		{
			System.out.println("control = " + control);
			control++;
		}*/
		do {
			//codigo a ejecutar
			System.out.println("Control = " + control);
			//modificador de la variable de control
			control++;
		}while(control < 3);
		/*
		for(int i=0; i<3; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("control = " + i);
				break;//termina el ciclo
				//solo deja que se ejecute una vez lo que esta antes.
			}
			System.out.println("Control = " + i);
		}
		*/
		/*
		for(int i=0; i<3; i++)
		{
			if(i % 2 == 0)
			{
				continue; //imprime los datos !=0
			}
			System.out.println("Control = " + i);
		}
		*/
		
	}
}
