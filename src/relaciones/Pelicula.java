package relaciones;

public class Pelicula {
private String nombre;
private int numero;
private int numero2;



public Pelicula(String nombre, Servicio servicio) {
	this.nombre = nombre;
	this.numero2 = 2;
	this.numero = 5;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void setNumero(int numero) {
	this.numero = numero;

 }

public int getNumero() {
	return this.numero;

 }

public Servicio metodoProbando() {
	if (this.numero == 2 && this.numero2 == 5) {
		if (this.nombre.equalsIgnoreCase("Juan")) {
			return Servicio.GRATIS;
		}
		return Servicio.PREMIUM;
		
	}else if (this.numero2 == 5 ) {
		
		return Servicio.SUPERPRO;
		
	} return Servicio.STANDAR;
  }
public String getNombreCliente(Cliente c) {
	c.getNombre();
	
	 return  "";
}
public void nuevoMetodoPro(Cliente c) {
	
	Cliente clientepro = c;
	
}
	
}