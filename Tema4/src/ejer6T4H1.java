package ejer6T4H1;
import java.util.*;
public class ejer6T4H1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);

		String frase, caracteres;
		final int MAX_LONGITUD = 80;
		int n,contaVoc, contaCon, contaNum,co;
		char letra;
		System.out.println("Introduce frase/palabra de menos de 80 carácteres");
		caracteres=teclado.nextLine();
		n=caracteres.length();
		frase=caracteres;
		contaVoc=0;
		contaCon=0;
		contaNum=0;


		while(n>80){
			System.out.println("Introduce frase/palabra de menos de 80 carácteres");
			caracteres=teclado.nextLine();
		}

		for(int i=0; i<n; i++){
			letra=frase.charAt(i);
			co=(int)letra;
			if (co==65 || co==97 || co==69 || co==101 || co==73 || co==105 || co==79 || co==111 || co==85 || co==117){
				contaVoc++;

			}//if 

			if (co>=64 && co<=68 || co>=70 && co<=72 || co>=74 && co<=78 || co>=80 && co<=84 || co>=86 && co<=90 ||
					co>=98 && co<=100 || co>=102 && co<=104 || co>=106 && co<=110 || co>=112 && co<=116 || co>=118 && co<=122){
				contaCon++;
			}//if
			if (co>47 && co<58){
				contaNum++;

			}//if

		}//for
		System.out.println("la frase "+frase+" contiene "+contaVoc+" vocales, "+contaCon+" consonantes y "+contaNum+" números");

	}//main

}//class
