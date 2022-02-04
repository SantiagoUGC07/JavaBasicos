package Metodos;

public class Metodos 
{
	// Metodo es una funcion 
		// Atributos de la clase
		int a, b;

		// Metodo void (Vacio)
		public void sumar() {
			int resultado = a + b;
			System.out.println("El resultado de sumar: " + a + " más " + b + " es " + resultado);

		}

		public int sumaConRetorno() {
			return a + b;
		}

		public double multiplicacionconArgumentos(double arg1, double arg2) {
			double c = arg1;
			double d = arg2;
			return c * d;
		}
}