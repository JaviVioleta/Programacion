package ejer1T4h1;
import java.util.*;
public class ejer2T4h2 {
	public static void main(String[] args) {
		String frase;
		final int MAX_LONGITUD = 80;
		int caracter, sumaMax, sumaMin, indiceDelCaracter;
		char letra;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD + " caracteres: ");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		sumaMax = sumaMin = 0;

		for(indiceDelCaracter=0; indiceDelCaracter<frase.length();indiceDelCaracter++ ){
			if(frase.charAt(indiceDelCaracter) >='a' && frase.charAt(indiceDelCaracter) <='z'){
				sumaMin++;
			}else if(frase.charAt(indiceDelCaracter) >='A' && frase.charAt(indiceDelCaracter) <='Z'){
				sumaMax++;
			}

		}
		System.out.println(frase + " \ntiene " + sumaMax + " mayuscula(s) " + sumaMin + " minuscula(s)");
	}//main
}//class 


