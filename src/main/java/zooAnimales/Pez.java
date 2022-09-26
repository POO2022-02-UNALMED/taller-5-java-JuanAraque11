package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado = new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public Pez() {
		this(null,0,null,null,null,0);
	}
	
	/*Hacer lo mismo que en mamifero*/

	public static int cantidadPeces(){
		return listado.size();
	}

	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		String colorEscamas= "rojo";
		int cantidadAletas= 6;
		String habitat="oceano";
		
		Pez salmon = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
		salmones++;
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		String colorEscamas= "gris";
		int cantidadAletas= 6;
		String habitat="oceano";
		
		Pez bacalao = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
		bacalaos++;
		return bacalao;
	}

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
}
