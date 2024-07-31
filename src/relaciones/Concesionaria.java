package relaciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Concesionaria {

	private String nombre;
	private ArrayList<Auto> autos;
	
	
	public Concesionaria(String nombre) {
		this.nombre = nombre;
		this.autos = new ArrayList<>();		
	}
	
	public void agregarAuto(Auto a) {
		this.autos.add(a);
		
	}
	
	public int cantAutos () {
		return autos.size();
	}
	
	public Auto autoMasKmsRecorridos() {
		Auto autoMax = null;
		int kmsMax = -1;
		for (Auto auto : autos) {
			if (auto.getKms() > kmsMax) {
				kmsMax = auto.getKms();
				autoMax = auto;
			}
		}
		return autoMax;
	}
	
	/*	private int maxKmsRecorridos() {
		int kmsMax = -1;
		for (Auto auto : autos) {
			if (auto.getKms() > kmsMax) {
				kmsMax = auto.getKms();				
			}
		}
		return kmsMax;
	}
	
	public ArrayList<Auto> autosMasKmsRecorridos(){
		ArrayList<Auto> listaDeMaximos = new ArrayList<>();
		int kmsMax = maxKmsRecorridos();
		for (Auto auto : autos) {
			if (auto.getKms() == kmsMax ) {
				listaDeMaximos.add(auto);
			}
		}
		return listaDeMaximos;
	} */
	
	public ArrayList<Auto> autosMasKmsRecorridos(){
		ArrayList<Auto> listaDeMaximos = new ArrayList<>();
		int kmsMax = -1;
		for (Auto auto : autos) {
			if (auto.getKms() == kmsMax ) {
				listaDeMaximos.add(auto);
			} else if(auto.getKms() > kmsMax) {
				kmsMax = auto.getKms();
				listaDeMaximos.clear();
				listaDeMaximos.add(auto);
			}
		}
		return listaDeMaximos;
	}
	
	public Auto autoMenosKmsRecorridos() {
		Auto autoMin = null;
		int kmsMin = Integer.MAX_VALUE;
		for (Auto auto : autos) {
			if (auto.getKms() < kmsMin) {
				kmsMin = auto.getKms();
				autoMin = auto;
			}
		}
		return autoMin;
	}
	
	public ArrayList<Auto> autosMenosKmsRecorridos(){
		ArrayList<Auto> listaDeMinimos = new ArrayList<>();
		int kmsMin = Integer.MAX_VALUE;
		for (Auto auto : autos) {
			if (auto.getKms() == kmsMin ) {
				listaDeMinimos.add(auto);
			} else if(auto.getKms() < kmsMin) {
				kmsMin = auto.getKms();
				listaDeMinimos.clear();
				listaDeMinimos.add(auto);
			}
		}
		return listaDeMinimos;
	}

	public ArrayList<Auto> getAutos() {
		return autos;
	}
	
	
}
	
	/* public int sumatoriaKmsRecorridos() {
		int acu = 0;
		for (Auto auto : autos) {
			acu = acu + auto.getKms();
		}
		return acu;
	}
	
	
	public double promedioKmsRecorrido() {
		double promedio = 0;
		if (cantAutos() > promedio ) {
			promedio = (double) sumatoriaKmsRecorridos() / cantAutos();
			}
			return promedio;
			// return (cantAutos() > promedio ? (double) sumatoriaKmsRecorridos() / cantAutos() : 0 )
		}
		
	}
	
	public void mostrarAutos () {
		if (autos.isEmpty()) {
			System.out.println("No hay autos");
		} else {		
			for (Auto a : autos) {
				System.out.println(a);
			}
		}
	} */
	

