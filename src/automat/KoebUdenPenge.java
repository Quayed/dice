package automat;

public class KoebUdenPenge
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		
		
		automat.udskrivBillet();
		// test af om der er blevet solgt en billet når man ikke har indsat nogle penge.
		automat.montørLogin("1234");
		retur = automat.getAntalBilletterSolgt();
		if (retur != 0){
			System.out.println("Der er blevet solgt en billet, det burde der ikke da vi ikke har indsat nogle penge - dette er en fejl");
			antalFejl++;
		}
		
		// test af balancen når man har prøvet at købe en billet uden penge.
		retur = automat.getBalance();
		if (retur != 0){
			System.out.println("Balance er lig: " + retur + ", den burde være lig 0. Derfor er dette endnu en fejl.");
			antalFejl++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");			
		}
	}
}