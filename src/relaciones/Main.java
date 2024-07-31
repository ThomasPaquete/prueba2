package relaciones;

public class Main {

	public static void main(String[] args) {
		
		Pelicula pelicula = new Pelicula("Juan", Servicio.PREMIUM);
		Cliente cliente = new Cliente("Juan", Servicio.PREMIUM);
		
	/*	if (!(cliente.getServicio() == Servicio.STANDAR) || !(pelicula.getServicio() == Servicio.PREMIUM)) {
			System.out.println("hola");
		} else System.out.println("jejeje"); {
			
		}
		System.out.println(pelicula.getNumero());
		pelicula.setNumero(4);
		System.out.println(pelicula.getNumero());
		*/
		
		System.out.println(pelicula.metodoProbando());
	}
}
