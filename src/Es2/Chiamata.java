package Es2;

public class Chiamata {
	private String numeroChiamato;
	private int durataChiamata;

	public Chiamata(String numeroChiamato, int durataChiamata){
		this.numeroChiamato=numeroChiamato;
		this.durataChiamata=durataChiamata;
	}
	public String getNumeroChiamato() {
		return numeroChiamato;
	}

	public int getDurata() {
		return durataChiamata;
	}
}
