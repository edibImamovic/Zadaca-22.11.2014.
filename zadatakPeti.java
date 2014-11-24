/* Edib Imamovic , zadatakPeti, v1 24.11.2014. 21.00h
 * 
 * Napisati program koji implementira igru pogađanja brojeva. Računar memoriše
 * neki slučajno izabrani broj između 1 i 100 , a zatim korisnik pogađa taj broj. Za svaki 
 * pokušaj, računar treba ispisati da li je traženi broj manji, veci ili jednak unesenom 
 * broju. Kada je broj jednak, igra se završava. Igrač može izaci iz igre prije kraja unosom broja -1.
 * Nakon sto korisnik pogodi broj ispisati odgovarajucu poruku i broj pokusaja pogadanja.
 *  
 */
public class zadatakPeti {
	public static void main(String[] args) {
		
		System.out.println("Unesite broj");
		double unosBroja = TextIO.getInt();
		double randomBroj = (Math.random()*100);
		boolean interval = unosBroja < 100 && unosBroja > 0;
		
		do {
			
			if (unosBroja == -1) {
				System.out.println("Hvala sto ste igrali , kraj programa");
				return;
			}
			else if (unosBroja == randomBroj) {
				System.out.printf("Cestitam pogodili ste:", randomBroj );
				return;
			}
			else if (unosBroja < randomBroj && interval) {
				System.out.println("Broj koji ste unijeli je manji od unesenog");
				return;
			}
			else if (unosBroja > randomBroj && interval) {
				System.out.println("Broj koji ste unijeli je veci od unesenog");
				return;
			}
		} while (unosBroja != randomBroj);
			
		}		
				
}

