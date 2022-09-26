package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private static ArrayList<Animal> animales = new ArrayList<>();

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona() {
		this(null,null);
	}

	public static void agregarAnimales(Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
	}
	
	public static int cantidadAnimales() { /*Talvez es poner los get y set de primeros antes que este*/
		return animales.size();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public static ArrayList<Animal> getAnimales() {
		return animales;
	}

	public static void setAnimales(ArrayList<Animal> animales) {
		Zona.animales = animales;
	}
	
}
