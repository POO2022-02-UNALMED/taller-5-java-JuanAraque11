package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	
	private static ArrayList<Reptil> listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	public Reptil() {
		this(null,0,null,null,null,0);
	}
	
	/*Hacer lo mismo que en mamifero*/
	
	public static int cantidadReptiles(){
		return listado.size();
	}
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		String colorEscamas= "verde";
		String habitat= "humedal";
		int largoCola= 3;
		
		Reptil iguana = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
		iguanas++;
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		String colorEscamas= "blanco";
		String habitat= "jungla";
		int largoCola= 1;
		
		Reptil serpi = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
		serpientes++;
		return serpi;
	}
	
	public static ArrayList<Reptil> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
}
