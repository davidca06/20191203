package MiExamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Teclea un número menor de 3000: ");
		int numero=in.nextInt();
		
		
		int millar;
		int diferencia;
		int centena;
		int decena;
		int unidad;
		
			millar=numero/1000;
			do {
				diferencia=millar-1;
				System.out.print("M");
				millar=diferencia;
			}while (diferencia!=0);
			
			centena=(numero%1000)/100;
			
			do {
				diferencia=centena-1;
				System.out.print("C");
				centena=diferencia;
			}while (centena!=0);
		
		decena=((numero%1000)%100)/10;
		do {
			diferencia=decena-1;
			System.out.print("X");
			decena=diferencia;
		}while (decena!=0);
		
		unidad=((numero%1000)%100)%10;
		do {
			diferencia=unidad-1;
			System.out.print("I");
			unidad=diferencia;
		}while (unidad!=0);
	}

}
