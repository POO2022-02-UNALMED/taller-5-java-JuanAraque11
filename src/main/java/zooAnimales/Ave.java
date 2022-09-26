package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public Ave() {
		this(null,0,null,null,null);
	}

	/*Hacer lo mismo que en mamifero*/
	
	public static int cantidadAves(){
		return listado.size();
	}

	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		String colorPlumas = "cafe glorioso";
		String habitat = "montanas";
		
		Ave halcon = new Ave(nombre, edad, habitat, genero, colorPlumas);
		halcones++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		String colorPlumas = "blanco y amarillo";
		String habitat = "montanas";
		
		Ave agui = new Ave(nombre, edad, habitat, genero, colorPlumas);
		aguilas ++;
		return agui;
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	
}
