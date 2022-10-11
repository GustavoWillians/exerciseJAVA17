package entities;

public class student {
	
	public double notaum;
	public double notadois;
	public double notatres;
	public String name;
	
	public double notafinal() {
		return notaum + notadois + notatres;
	}
	
	public double pass() {
		if (notafinal() < 60.0) {
			return 60.0 - notafinal();
		}
		else {
			return 0.0;
		}
	}

	
}
