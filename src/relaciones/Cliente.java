package relaciones;

public class Cliente {
	

	private String nombre;
	private Servicio servicio;

	
	public Cliente(String nombre, Servicio servicio) {
		this.nombre = nombre;
		this.servicio = servicio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
}
