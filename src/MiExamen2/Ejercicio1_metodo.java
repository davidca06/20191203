package MiExamen2;

import java.util.Scanner;

public class Ejercicio1_metodo {
	
	static Scanner in=new Scanner(System.in);
	static int numero;
	static String c1, c2, c3;
	public static void main(String[] args) {
		
		pedirNumero();
		numeroMillares();
		numero=numero%1000;
		numeroCentenas();
		numero=numero%100;
		numeroDecenas();
		numero=numero%10;
		numeroUnidades();

	}
	static int pedirNumero() {
		System.out.println("Teclea un número menor o igual de 3000: ");
		numero=in.nextInt();
		return numero;
	}
	static void numeroMillares() {
		if (numero>=1000) {
			int millares=numero/1000;
			switch (millares) {
			case 1:
				c1="M";
				System.out.print(c1);
				break;
			case 2:
				c1="M";
				System.out.print(c1+c1);
				break;
			case 3:
				c1="M";
				System.out.print(c1+c1+c1);
				break;
			}
					
		}
	}
	static void numeroCentenas() {
		if (numero>=100) {
			int centenas=numero/100;
			switch (centenas) {
			case 1:
				c1="C";
				System.out.print(c1);
				break;
			case 2:
				c1="C";
				System.out.print(c1+c1);
				break;
			case 3:
				c1="C";
				System.out.print(c1+c1+c1);
				break;
			case 4:
				c1="C";
				c2="D";
				System.out.print(c1+c2);
				break;
			case 5:
				c2="D";
				System.out.print(c2);
				break;
			case 6:
				c1="C";
				c2="D";
				System.out.print(c2+c1);
				break;
			case 7:
				c1="C";
				c2="D";
				System.out.print(c2+c1+c1);
				break;
			case 8:
				c1="C";
				c2="D";
				System.out.print(c2+c1+c1+c1);
				break;
			case 9:
				c1="C";
				c3="M";
				System.out.print(c1+c3);
				break;
			}
			
			
		}
	}
	static void numeroDecenas() {
		if (numero>=10) {
			int decenas=numero/10;
			switch (decenas) {
			case 1:
				c1="X";
				System.out.print(c1);
				break;
			case 2:
				c1="X";
				System.out.print(c1+c1);
				break;
			case 3:
				c1="X";
				System.out.print(c1+c1+c1);
				break;
			case 4:
				c1="X";
				c2="L";
				System.out.print(c1+c2);
				break;
			case 5:
				c2="L";
				System.out.print(c2);
				break;
			case 6:
				c1="X";
				c2="L";
				System.out.print(c2+c1);
				break;
			case 7:
				c1="X";
				c2="L";
				System.out.print(c2+c1+c1);
				break;
			case 8:
				c1="X";
				c2="L";
				System.out.print(c2+c1+c1+c1);
				break;
			case 9:
				c1="X";
				c3="C";
				System.out.print(c1+c3);
				break;
			}
			
		}
	}
	static void numeroUnidades() {
		if (numero>=1)
		 {
			int unidades=numero;
			switch (unidades) {
			case 1:
				c1="I";
				System.out.print(c1);
				break;
			case 2:
				c1="I";
				System.out.print(c1+c1);
				break;
			case 3:
				c1="I";
				System.out.print(c1+c1+c1);
				break;
			case 4:
				c1="I";
				c2="V";
				System.out.print(c1+c2);
				break;
			case 5:
				c2="V";
				System.out.print(c2);
				break;
			case 6:
				c1="I";
				c2="V";
				System.out.print(c2+c1);
				break;
			case 7:
				c1="I";
				c2="V";
				System.out.print(c2+c1+c1);
				break;
			case 8:
				c1="I";
				c2="V";
				System.out.print(c2+c1+c1+c1);
				break;
			case 9:
				c1="I";
				c3="X";
				System.out.print(c1+c3);
				break;
			}
		 }			

}

	}

