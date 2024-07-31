package relaciones;

public class Auto {

	private String patente;
	private String color;
	private int kms;
	
	public Auto(String patente, String color, int kms) {
		this.patente = patente;
		this.color = color;
		 setKms(kms);
		
	}


 
	public int getKms() {
		System.out.println(kms);
		return kms;
		
	}
	
	private void setKms(int valor) {
		if (valor > 100) {
			valor = 100;
			this.kms = valor;
		} else if (valor < 0) {
			valor = 0;
			this.kms = valor;
		}  this.kms = valor;
				
	}
	
	
	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", color=" + color + ", kms=" + kms + "]";
	}
	
}
