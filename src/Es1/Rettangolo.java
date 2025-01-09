package Es1;

public class Rettangolo {
	private double altezza;
	private double larghezza;

	public Rettangolo(double altezza, double larghezza){
		this.altezza=altezza;
		this.larghezza=larghezza;
	}

	public double calcoloArea(){
		return altezza*larghezza;
	}
	public double calcoloPerimetro(){
		return 2*(altezza+larghezza);
	}

}
