/*
 * Edib Imamović: 22.11.2014. 22:43h
 * Napisati program koji učitava tri cijela broja iz interval od 50 do 200 . Ako neki od
 * unesenih brojeva nisu iz tog intervala, program treba ispisati poruku i završiti sa 
 * radom. Ako su brojevi unutar tog intervala, potrebno je ispisati unesene brojeve 
 * poredane po veličini, od najmanjeg prema najvecem. Dodatno je potrebno odrediti 
 * koliko različitih brojeva je uneseno.
 * U bilo kojem trenutku rad programa se moze zavrsiti naredbom return;
 */

	public class zadatakDva {
		public static void main(String[] args) {
			
			System.out.println("Molim Vas da unesete prvi broj:");
				int prviBroj = TextIO.getInt();
			
			System.out.println("Molim Vas da unesete drugi broj:");
				int drugiBroj = TextIO.getInt();
			
			System.out.println("Molim Vas da unesete treci broj:");
				int treciBroj = TextIO.getInt();
			
			
			for (int brojac=50; brojac<=200; brojac++){
				if (prviBroj==brojac && drugiBroj==brojac && treciBroj==brojac){
				}
					else if ((prviBroj>drugiBroj)&&(prviBroj>treciBroj)&&(drugiBroj>treciBroj)){
						System.out.printf("Uneseni brojevi po veliciini su:d%,d%,d%", prviBroj, drugiBroj, treciBroj);
					}
					else if ((drugiBroj>prviBroj)&&(drugiBroj>treciBroj)&&(prviBroj>treciBroj)){
						System.out.printf("Uneseni brojevi po veliciini su:d%,d%,d%", drugiBroj, prviBroj, treciBroj);
					}
					else if ((treciBroj>prviBroj)&&(treciBroj>drugiBroj)&&(drugiBroj>prviBroj)){
						System.out.printf("Uneseni brojevi po veliciini su:d%,d%,d%", treciBroj, drugiBroj, prviBroj);
					}
					else System.out.println("Brojevi nisu u intervalu");
					
			}
		
		
		}
			 
	}
	
