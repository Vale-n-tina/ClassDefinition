package Es2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sim {
	private String numeroTelefono;
	private double credito;
	private List<Chiamata> listeChiamata;


	public Sim(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		this.credito =0;
		this.listeChiamata = new ArrayList<>();

	}

	public void aggiungiChiamata(String numeroChiamato, int durataChiamata){
		if(listeChiamata.size()== 5){
			listeChiamata.remove(0);
		}
		listeChiamata.add(new Chiamata(numeroChiamato, durataChiamata));
	}

	public void stampaDati(){
		for(Chiamata chiamata : listeChiamata){
			System.out.println(chiamata);
		}
	}

 public void aggiungiCredito(double credito){
		this.credito+=credito;
 }
 public void getChiamate(String numeroChiamato, int durata){
	Chiamata nuovaChiamata=new Chiamata (numeroChiamato, durata);

 }


	@Override
	public String toString() {
		return "Sim{" +
				  "numeroTelefono='" + numeroTelefono + '\'' +
				  ", credito=" + credito +
				  ", listeChiamata=" + listeChiamata +
				  '}';
	}
}

