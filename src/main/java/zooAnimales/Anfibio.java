package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {

	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int Anfi=listado.size();
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}

	public Anfibio() {
		this(null,0,null,null,null,false);
	}

	public int cantidadAnfibios(){
		return ranas+salamandras;
	}

	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		String colorPiel= "rojo";
		boolean venenoso= true;
		String habitat= "selva";
		
		Anfibio rana = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso);
		listado.add(rana);
		ranas++;
		Animal.aumentaTotal(1);
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		String colorPiel= "negro";
		boolean venenoso= false;
		String habitat= "selva";
		
		Anfibio sala = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso);
		listado.add(sala);
		salamandras++;
		Animal.aumentaTotal(1);
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
