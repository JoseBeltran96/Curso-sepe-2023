package Ejercicios;

import java.util.Scanner;

public class EstructuraSecuencial {

	// Ejercicio 1
	public static void dosnumeros(Scanner scan) {

		System.out.println("Introduzca el primer numero: ");
		int x = scan.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int y = scan.nextInt();

		System.out.println("Los numeros introducidos son: " + x + " y " + y);
	}

	// Ejercicio 2
	public static void nombre(Scanner scan) {

		System.out.println("Introduzca su nombre: ");
		String nombre = scan.nextLine();

		System.out.println("Buenos dias " + nombre);
	}

	// Ejercicio 3
	public static void numerodobletriple(Scanner scan) {

		System.out.println("Introduzca un numero: ");
		int x = scan.nextInt();

		System.out.println("El doble del numero es: " + (x * 2));
		System.out.println("El triple del numero es: " + (x * 3));
	}

	// Ejercicio 4
	public static void deGaF(Scanner scan) {

		System.out.println("Introduzca los grados centigrados: ");
		float g = scan.nextFloat();

		float f = 32 + (9 * g / 5);

		System.out.println(g + " grados centrigrados son " + String.format("%.2f", f) + " grados Fahrenheit.");
	}

	// Ejercicio 5
	public static void circunferencia(Scanner scan) {

		System.out.println("Introduzca el radio de la circunferencia: ");
		float r = scan.nextFloat();

		double longitud = 2 * Math.PI * r;
		double area = Math.PI * Math.pow(r, 2);

		System.out.println("La longitud de la circunferencia es: " + String.format("%.2f", longitud));
		System.out.println("El area de la circunferencia es: " + String.format("%.2f", area));
	}

	// Ejercicio 6
	public static void velocidad(Scanner scan) {

		System.out.println("Introduzca la velocidad en Km/h: ");
		float vel = scan.nextFloat();

		float metrosSegundos = vel * 1000 / 3600;

		System.out.println(vel + " Km/h equivalen a " + String.format("%.2f", metrosSegundos) + " m/s");
	}

	// Ejercicio 7
	public static void hipotenusa(Scanner scan) {

		System.out.println("Introduzca la longitud del primer cateto: ");
		double cateto1 = scan.nextDouble();
		System.out.println("Introduzca la longitud del segundo cateto: ");
		double cateto2 = scan.nextDouble();

		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

		System.out.println("La longitud de la hipotenusa es: " + String.format("%.2f", hipotenusa));
	}

	// Ejercicio 8
	public static void volumenEsfera(Scanner scan) {

		System.out.println("Introduzca el radio de la esfera: ");
		double r = scan.nextDouble();

		double v = (4 / 3) * Math.PI * Math.pow(r, 3);

		System.out.println("El volumen de la esfera es: " + String.format("%.2f", v));
	}

	// Ejercicio 9
	public static void areaTriangulo(Scanner scan) {

		System.out.println("Introduzca la longitud del primer lado: ");
		double lado1 = scan.nextDouble();
		System.out.println("Introduzca la longitud del segundo lado: ");
		double lado2 = scan.nextDouble();
		System.out.println("Introduzca la longitud del tercer lado: ");
		double lado3 = scan.nextDouble();

		double p = (lado1 + lado2 + lado3) / 2;

		double area = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));

		System.out.println("El area del triangulo es: " + String.format("%.2f", area));
	}

	// Ejercicio 10
	public static void cifrasSeparadas(Scanner scan) {

		System.out.println("Introduzca un numero de 3 cifras: ");
		int x = scan.nextInt();

		int x1 = x / 100;
		int x2 = (x / 10) % 10;
		int x3 = x % 10;

		System.out.println("Primera cifra: " + x1);
		System.out.println("Segunda cifra: " + x2);
		System.out.println("Tercera cifra: " + x3);
	}

	// Ejercicio 11
	public static void cifras(Scanner scan) {

		System.out.println("Introduce un numero de cinco cifras: ");
		int x = scan.nextInt();

		System.out.println(x / 10000);
		System.out.println(x / 1000);
		System.out.println(x / 100);
		System.out.println(x / 10);
		System.out.println(x);
	}

	// Ejercicio 12
	public static void cifrasReves(Scanner scan) {

		System.out.println("Introduce un numero de cinco cifras: ");
		int x = scan.nextInt();

		System.out.println(x % 10);
		System.out.println(x % 100);
		System.out.println(x % 1000);
		System.out.println(x % 10000);
		System.out.println(x);
	}

	public static void main(String[] args) {

		System.out.println("1. Dos numeros");
		System.out.println("2. Nombre");
		System.out.println("3. Doble y triple de un numero");
		System.out.println("4. De grados a Fahrengeit");
		System.out.println("5. Longitud y area de una circunferencia");
		System.out.println("6. De Km/h a m/s");
		System.out.println("7. Calculo de hipotenusa");
		System.out.println("8. Volumen de una esfera");
		System.out.println("9. Area de un triangulo");
		System.out.println("10. Cifras separadas");
		System.out.println("11. Cinco cifras");
		System.out.println("12. Cinco cifras al reves");

		Scanner scan = new Scanner(System.in);
		System.out.println("Elija el programa: ");
		int opcion = scan.nextInt();

		switch (opcion) {
		case 1: {
			dosnumeros(scan);
			break;
		}
		case 2: {
			nombre(scan);
			break;
		}
		case 3: {
			numerodobletriple(scan);
			break;
		}
		case 4: {
			deGaF(scan);
			break;
		}
		case 5: {
			circunferencia(scan);
			break;
		}
		case 6: {
			velocidad(scan);
			break;
		}
		case 7: {
			hipotenusa(scan);
			break;
		}
		case 8: {
			volumenEsfera(scan);
			break;
		}
		case 9: {
			areaTriangulo(scan);
			break;
		}
		case 10: {
			cifrasSeparadas(scan);
			break;
		}
		case 11: {
			cifras(scan);
			break;
		}
		case 12: {
			cifrasReves(scan);
			break;
		}
		default:

		}

		scan.close();
	}

}
