package MiExamen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2_bis {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		int numero1;
		int numero2;
		int numeroImpar;
		int sumaImpar=0;
		
		System.out.println("Teclea el primer número: ");
		numero1=Integer.parseInt(in.readLine());
		System.out.println("Teclea el segundo número: ");
		numero2=Integer.parseInt(in.readLine());
		
		if (numero1>numero2){
			
			for (int i=numero1; i>=numero2; i--){
				
				if (i%2!=0){
					
					sumaImpar=sumaImpar+i;
				}
						
			}
			System.out.println("La suma de impares es: "+sumaImpar);
						
			}
			
			
			
			else {
				
				for (int i=numero2; i>=numero1; i--){
					
					if (i%2!=0){
						
						sumaImpar=sumaImpar+i;
					}
							
				}
				System.out.println("La suma de impares es: "+sumaImpar);
							
				}
			
		
		
	}

}
