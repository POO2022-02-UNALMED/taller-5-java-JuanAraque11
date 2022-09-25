package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public static int Repti=listado.size();

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	public Reptil() {
		this(null,0,null,null,null,0);
	}
	
	/*Hacer lo mismo que en mamifero*/
	
	public int cantidadReptiles(){
		return iguanas+serpientes;
	}
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
		String colorEscamas= "verde";
		String habitat= "humedal";
		int largoCola= 3;
		
		Reptil iguana = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
		listado.add(iguana);
		iguanas++;
		Animal.aumentaTotal(1);
	}
	
	public void crearSerpientes(String nombre, int edad, String genero) {
		String colorEscamas= "blanco";
		String habitat= "jungla";
		int largoCola= 1;
		
		Reptil serpi = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
		listado.add(serpi);
		serpientes++;
		Animal.aumentaTotal(1);
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
