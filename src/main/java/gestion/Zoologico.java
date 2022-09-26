package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas = new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public Zoologico() {
		this(null,null);
	}
	
	public void agregarZonas(Zona nuevaZona) {
		zonas.add(nuevaZona);
	}
	
	public int cantidadTotalAnimales() {
		int totalAni = 0;
		for(Zona zona:zonas) {
			totalAni += zona.cantidadAnimales();
		}
		return totalAni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public static ArrayList<Zona> getZona() {
		return zonas;
	}

	public static void setZona(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}

}
