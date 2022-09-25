package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public Mamifero() {
		this(null,0,null,null,false,0);
	}
	
	public static int cantidadMamiferos(){
		return caballos+leones;
	}

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		boolean pelaje = true;
		int patas= 4; 
		String habitat = "pradera";
		
		Mamifero caba = new Mamifero(nombre, edad, habitat, genero, pelaje, patas);
		listado.add(caba);
		caballos ++;
		Animal.aumentaTotal(1);
		return caba;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		boolean pelaje = true;
		int patas= 4; 
		String habitat = "selva";
		
		Mamifero leon = new Mamifero(nombre, edad, habitat, genero, pelaje, patas);
		listado.add(leon);
		leones ++;
		Animal.aumentaTotal(1);
		return leon;
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	
}
