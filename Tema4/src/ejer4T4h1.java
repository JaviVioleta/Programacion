//4. Leer una cadena de hasta 80 caracteres y pasarla en funci�n de una variable de opci�n a may�sculas � a min�sculas e imprimir la cadena resultante//
package ejer1T4h1;
import java.util.*;
public class ejer4T4h1 {

	public static void main(String[] args) {

		String caracteres,frase,fraseinv;
		char letra;
		int n,posletra,c;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce frase/palabra de menos de 80 car�cteres");
		caracteres=teclado.nextLine();
		n=caracteres.length();
		frase=caracteres;
		fraseinv="";

		while(n>80){
			System.out.println("Introduce frase/palabra de menos de 80 car�cteres");
			caracteres=teclado.nextLine();

		}



	}//main

}//class


/*String caracteres,frase,fraseinv;
		char letra;
		int n,co,c;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce frase/palabra de menos de 80 car�cteres");
		caracteres=teclado.nextLine();
		n=caracteres.length();
		frase=caracteres;
		fraseinv="";

		while(n>80){
			System.out.println("Introduce frase/palabra de menos de 80 car�cteres");
			caracteres=teclado.nextLine();

		}
		for (c=0 ; c<n; c++){
			letra=frase.charAt(c);
			co=(int)letra;
			if (co>96 && co<121){
				co=co-32;
				letra =(char)co;
				fraseinv=fraseinv+letra;
				co=co+32;
			}

			if(co>64 && co<90){
				co=co+32;
				letra =(char)co;
				fraseinv=fraseinv+letra;
				co=co-32;


			}

		}
		System.out.println(fraseinv);*/

