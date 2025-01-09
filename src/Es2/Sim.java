package Es2;


import java.util.Arrays;

public class Sim {
	private String numeroTelefono;
	private double credito;
	private Chiamata[] ultimeChiamate;


	public Sim(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		this.credito =0;
		this.ultimeChiamate = new Chiamata[5];

	}


 public void aggiungiCredito(double credito){
		this.credito+=credito;
 }

	@Override
	public String toString() {
		return "Sim{" +
				  "numeroTelefono='" + numeroTelefono + '\'' +
				  ", credito=" + credito +
				  ", ultimeChiamate=" + Arrays.toString(ultimeChiamate) +
				  '}';
	}
}

