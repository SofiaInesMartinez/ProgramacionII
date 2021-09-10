package tp5Ej4;

public class Contribuyente {
	private String nombre;
	private int cuit;
	private double montoFijo;
	private double ventas;
	private double desarrollo;
	protected Contribucion contribucion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public double getMontoFijo() {
		return montoFijo;
	}

	public void setMontoFijo(int montoFijo) {
		this.montoFijo = montoFijo;
	}

	public double getContribucion() {
		return contribucion.calcularContribucion(this);
	}

	public void setContribucion(Contribucion cc) {
		this.contribucion = cc;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double getDesarrollo() {
		return desarrollo;
	}

	public void setDesarrollo(double desarrollo) {
		this.desarrollo = desarrollo;
	}

	public Contribuyente(String nombre, int cuit, double montoFijo,
			double ventas, double desarrollo) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.montoFijo = montoFijo;
		this.ventas = ventas;
		this.desarrollo = desarrollo;
		contribucion = new Contribucion();//por defecto son Contribuyentes Simples
	}

}
