package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static int Pesi=listado.size();
	
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}

	public Pez() {
		this(null,-1,null,null,null,-1);
	}
	
	/*Hacer lo mismo que en mamifero*/

	public int cantidadPeces(){
		return salmones+bacalaos;
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
		listado.add(salmon);
		salmones++;
		Animal.aumentaTotal(1);
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		String colorEscamas= "gris";
		int cantidadAletas= 6;
		String habitat="oceano";
		
		Pez bacalao = new Pez(nombre, edad, habitat, genero, colorEscamas, cantidadAletas);
		listado.add(bacalao);
		bacalaos++;
		Animal.aumentaTotal(1);
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
