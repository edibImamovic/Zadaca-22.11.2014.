/*Edib Imamovic, 
 *zadatakTreci
 * 
 * Napisati program koji učitava koeficijente a, b I c koji su realnog tipa. 
 * Ti koeficijenti određuju funkciju:
 * f(x) = a * x2 +b * x + c
 * Program treba da provjeri da li su koeficijenti u intervalu od -10 do 10 . Ako nisu, 
 * program ispisuje poruku:
 * Ako koeficijenti a, b I c jesu u zadanom intervalu, program kao izlaz daje vrijednost 
 * funkcije u tački . Tačka se također unosi sa standardnog ulaza.
 * Unesite koeficijente a, b i c: 
 * 1 2 1
 * Unesite tacku x: 1
 * f(1) = 4+ b * x + c
 * Koeficienti a, b, c nisu u zadanom intervalu
 * 
 */

public class zadatakTreci {

	public static void main(String[] args) {
	System.out.println("Unesite koeficijent a:");
		double a = TextIO.getDouble();
	System.out.println("Unesite koeficijent b:");
		double b = TextIO.getDouble();
	System.out.println("Unesite koeficijent c:");
		double c = TextIO.getDouble();
	System.out.println("Unesite tacku x:");
		double x = TextIO.getDouble();
	
		double rezultat = ((a * (x * x) + (b * x )+ c ));
		double brojac=-10;
		
	    while (brojac<10){
	    	brojac++;
		}	
		
	    if (a==brojac || b==brojac || c==brojac ){
		
		System.out.printf("f(%d) = %d", x, rezultat );
	}	
			else if (a!=brojac || b!=brojac || c!=brojac ){
			System.out.println("Koeficienti a, b, c nisu u zadanom intervalu");
			}
		
		}
