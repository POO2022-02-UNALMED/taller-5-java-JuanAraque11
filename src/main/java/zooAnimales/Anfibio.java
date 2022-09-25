package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {

	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}

	public Anfibio() {
		this(null,0,null,null,null,false);
	}

	public static int cantidadAnfibios(){
		return listado.size();
	}

	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		String colorPiel= "rojo";
		boolean venenoso= true;
		String habitat= "selva";
		
		Anfibio rana = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso);
		
		ranas++;
		Animal.aumentaTotal(1);
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		String colorPiel= "negro";
		boolean venenoso= false;
		String habitat= "selva";
		
		Anfibio sala = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso);
		salamandras++;
		Animal.aumentaTotal(1);
		return sala;
	}

	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	
}
