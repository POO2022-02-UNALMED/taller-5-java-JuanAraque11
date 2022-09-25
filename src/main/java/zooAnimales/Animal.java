package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private static Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public Animal() {
		this(null,0,null,null);
	}

	public String movimiento() {
		return "desplazarse";
	}
	public static void aumentaTotal(int aume) {
		totalAnimales = totalAnimales + aume;
	}
	
	public String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.Mami +"\n" + 
	           "Aves: " + Ave.Avi + "\n" +
	           "Reptiles: "+ Reptil.Repti  +"\n" + 
	           "Peces: " + Pez.Pesi +"\n"+
               "Anfibios: "+ Anfibio.Anfi;
	}
	
	@Override
	public String toString() {
		if(zona != null) {
			return "Mi nombre es" + nombre + "tengo una edad de" + edad + "habito en"+ habitat + "y mi genero es" + genero + "la zona en la que me ubico es"+ zona.getNombre() + "en el"+ zona.getZoo().getNombre() ;
		}
		else {
			return "Mi nombre es" + nombre + "tengo una edad de" + edad + "habito en"+ habitat + "y mi genero es" + genero;
		}
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public static Zona getZona() {
		return zona;
	}

	public static void setZona(Zona zona) {
		Animal.zona = zona;
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	
}