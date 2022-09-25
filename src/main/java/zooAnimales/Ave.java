package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int Avi=listado.size();
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	}

	public Ave() {
		this(null,-1,null,null,null);
	}

	/*Hacer lo mismo que en mamifero*/
	
	public int cantidadAves(){
		return halcones + aguilas;
	}

	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		String colorPlumas = "cafe glorioso";
		String habitat = "montanas";
		
		Ave halcon = new Ave(nombre, edad, habitat, genero, colorPlumas);
		listado.add(halcon);
		halcones++;
		Animal.aumentaTotal(1);
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		String colorPlumas = "blanco y amarillo";
		String habitat = "montanas";
		
		Ave agui = new Ave(nombre, edad, habitat, genero, colorPlumas);
		listado.add(agui);
		aguilas ++;
		Animal.aumentaTotal(1);
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
