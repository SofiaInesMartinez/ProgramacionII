package tp5Ej4;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private int cantHabitantes;
	private ArrayList<Contribuyente> contribuyentes;
	private double gastos;
	
	
	public double getRecaudación(){
		double recaudacion = 0;
		for (int i = 0; i < contribuyentes.size(); i++) {
			recaudacion += contribuyentes.get(i).getContribucion();
		}return recaudacion;
	}
	
	public void addContribuyente(Contribuyente c){
		contribuyentes.add(c);
	}
	
	public boolean tieneDeficit(){
		return gastos>getRecaudación();
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}

	public double getGastos() {
		return gastos;
	}

	public void setGastos(double gastos) {
		this.gastos = gastos;
	}

	public Ciudad(String nombre, int cantHabitantes, double gastos) {
		super();
		this.nombre = nombre;
		this.cantHabitantes = cantHabitantes;
		this.gastos = gastos;
		this.contribuyentes = new ArrayList<Contribuyente>();
	}
	
	
}
