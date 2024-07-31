package relaciones;

public class AAAA {

private int valor1;
private int valor2;
private int valor3;

public AAAA(int valor1, int valor2, int  valor3) {
	this.valor1 = valor1;
	this.valor2 = valor2;
	this.valor3 = valor3;

}


public int getValor1() {
	return valor1;
}
private void setValor1(int valor1) {
	this.valor1 = valor1;
}
public int getValor2() {
	return valor2;
}
private void setValor2(int valor2) {
	this.valor2 = valor2;
}
public String competir (AAAA competidor) {
	if (this.getValor1() < competidor.getValor1()) {
		return "aaaaa";
	}return "FFFF ";
	
}

public String hola () {
	return "holaaa";
}

public int pruebaif() {
	if (valor1 < valor2 && valor1 < valor3) {
		return valor1;
	}
	return 99;
}



}
