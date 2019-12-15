package MiExamen2;

import java.util.Scanner;

public class Ejercicio3_metodo {

	static Scanner in=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		pedirNumero();
		

	}
	static void pedirNumero() {
		System.out.println("Teclea un número: ");
		int numero=in.nextInt();
		comprobar(numero);
	}
	static void comprobar(int numero) {
		int suma=0, numeroGuay=0;
		if (numero % 2 != 0) {
			System.out.println(numero + " es guay");
		} else {
			do {
				for (int i = 1; i <= numero; i = i + 2) {
					suma = 0;
					for (int j = i; j <= numero; j++) {
						suma = suma + j;
						System.out.println(suma);
						
						if (suma == numero) {
							numeroGuay = numero;
						}
						
					}
				}

			} while (suma<=numero);
			
			if (numeroGuay == numero) {
				System.out.println(numeroGuay + " es guay");
			} else {
				System.out.println(numero + " no es guay");
			}
		}
	}
}
