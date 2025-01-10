package Es2;

public class TestSim {
	public static void main(String[] args){

		Sim miaSim=new Sim("3459372254");
		miaSim.aggiungiCredito(20);

		miaSim.aggiungiChiamata("3456789012", 15);
		miaSim.aggiungiChiamata("3422789012", 15);
		miaSim.aggiungiChiamata("3456789012", 15);
		miaSim.aggiungiChiamata("3456789012", 15);
		miaSim.aggiungiChiamata("3456789012", 15);

		//getChiamata[0]=new Chiamata("3234567890", 10);
		System.out.println( miaSim) ;
		miaSim.stampaDati();
		miaSim.aggiungiChiamata("344566788", 5);
		System.out.println("nuove chiamata");
		miaSim.stampaDati();
	}

}
