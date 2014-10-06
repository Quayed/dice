package automat;

public class ForkertBilletpris
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		automat.indsætPenge(500); // der indsættes 500 kr
		
		// der købes 6 billeter til en pris af 10kr stykket
		automat.udskrivBillet();
		automat.udskrivBillet();
		automat.udskrivBillet();
		automat.udskrivBillet();
		automat.udskrivBillet();
		automat.udskrivBillet();
		
		
		automat.montørLogin("1234"); // Der logges ind som montør
		automat.setBilletpris(100); // Billetprisen sættes til 100kr 
		retur = automat.getTotal(); // Maskines balance hentes
		
		if (retur != 60){
			System.out.println("FEJL, getTotal() fortæller mig at der er købt for: " + retur + "kr, selvom der kun er brugt 60kr");
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