package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas ){
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}

	public Zoologico() {
		this(null,null,null);
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

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

}
