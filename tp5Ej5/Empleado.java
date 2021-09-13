package tp5Ej5;

public class Empleado {
	protected String nombre;
	protected String apellido;
	protected int dni;
	protected double sueldoFijo;
	protected Sueldo sueldo;
	private double ventas;
	private double porcVenta;
	private int cantVentas;
	private double bono;
	private int minVentas;

	
	public void setSueldo(Sueldo sueldo) {
		this.sueldo = sueldo;
	}

	public boolean recibeBono() {
		return (cantVentas > minVentas);
	}

	public double getBono() {
		return bono;
	}

	public void setMinVentas(int minVentas) {
		this.minVentas = minVentas;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	public double getSueldo() {
		return sueldo.getSueldo(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(int sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}

	public double getPorcVenta() {
		return porcVenta;
	}

	public void setPorcVenta(double porcVenta) {
		this.porcVenta = porcVenta;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public Empleado(String nombre, String apellido, int dni, double sueldoFijo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldoFijo = sueldoFijo;
		this.ventas = 0;
		this.porcVenta = 0;
		this.cantVentas = 0;
		this.sueldo = new Sueldo();
	}

	public Empleado(String nombre, String apellido, int dni, double sueldoFijo,
			double ventas, double porcVenta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldoFijo = sueldoFijo;
		this.ventas = ventas;
		this.porcVenta = porcVenta;
		this.cantVentas = 0;
		this.sueldo = new SueldoVentas();
	}

	public Empleado(String nombre, String apellido, int dni, double sueldoFijo,
			double ventas, double porcVenta, int cantVentas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldoFijo = sueldoFijo;
		this.ventas = ventas;
		this.porcVenta = porcVenta;
		this.cantVentas = cantVentas;
		this.sueldo = new SueldoBono();
	}

}
