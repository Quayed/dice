package automat;

public class NegativBilletpris
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		automat.montørLogin("1234");
		automat.setBilletpris(-10);
		retur = automat.getBilletpris();
		if(retur < 0){
			System.out.println("Billetprisen er sat til: " + retur + ", dette er forkert da den ikke burde kunne være negativ");
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