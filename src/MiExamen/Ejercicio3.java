package MiExamen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Teclea un número entero: ");
		
		int numero=in.nextInt();
		
		for (int i=numero; i>=1; i--){
			for (int j=1; j<=(i-1); j++){
				if (numero==i+j) {
					System.out.println("El número es guay");
				}
				else {
					System.out.println("El número no es guay");
				}
			}
		}

	}

}
