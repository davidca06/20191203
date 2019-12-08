package MiExamen2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Teclea un número: ");
		int numero=in.nextInt();
		
		String c1, c2, c3;
		int millares, centenas, decenas, unidades;
		
		if (numero>=1000) {
			millares=numero/1000;
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
		numero=numero%1000;
			if (numero>=100) {
				centenas=numero/100;
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
			numero=numero%100;
			if (numero>=10) {
					decenas=numero/10;
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
			numero=numero%10;
			if (numero>=1)
				 {
					unidades=numero;
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
