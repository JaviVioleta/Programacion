//3. Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la frase o un mensaje indicando que no está.//
package ejer1T4h1;
import java.util.*;
public class ejer3T4h1 {

	public static void main(String[] args) {
		String frase, palabra;
		final int MAX_LONGITUD = 80;
		int n;

		Scanner teclado = new Scanner(System.in);

		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD + " caracteres: ");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		System.out.println("dame la palabra que quieres encontrar");
		palabra=teclado.nextLine();




		/*if (frase.startsWith(palabra + " ")){
			System.out.println("La palabra está en la posición " + frase.indexOf(palabra));
		}else if (frase.indexOf(" " + palabra + " ")!= -1){
			System.out.println("La palabra está en la posición " + ( frase.indexOf(" " + palabra + " ") + 1) );
		}else if (frase.endsWith(" " + palabra)){
			System.out.println("La palabra está en la posición " + frase.lastIndexOf(palabra));
		}else{
			System.out.println("La palabra que buscas no existe");
		}//else
		 */		
	}//main

}//class
