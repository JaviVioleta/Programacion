/*10. Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras
distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras
debemos trabajar solo con mayúsculas.*/
package Tema4;
import java.util.*;
public class ejer10T4H1 {

	public static void main(String[] args) {
		String frase="";
		Scanner teclado = new Scanner(System.in);
		int VecContraLetras[] = new int [26];
		int k, indice, indiceContadores;
		final int MAX=60;
		System.out.println("Introduce frase/palabra de menos de 60 carácteres");
		frase = teclado.nextLine();
		while(frase.length()>MAX){
			System.out.println("Cadena máxima de 60 caracteres");
			frase = teclado.nextLine();
		}
		for (k = 0; k < 26; k++){
			VecContraLetras[k] = 0;
		}
		for(indice = 0; indice < frase.length(); indice++){
			indiceContadores = frase.charAt(indice) - 65;
			VecContraLetras[indiceContadores]++;
		}
			
		
		
	}//main

}//class
