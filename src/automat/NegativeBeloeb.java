package automat;

public class NegativeBeloeb
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		// test af hvad der sker når man prøver at indbetale et negativt beløb
		automat.indsætPenge(-10);
		retur = automat.returpenge();
		
		if (retur != 0){
			System.out.println("FEJL, returpenge() bør returnere 0. Istedet returnere den: " + retur);
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