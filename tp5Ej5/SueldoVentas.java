package tp5Ej5;

public class SueldoVentas extends Sueldo {

	public double getSueldo(Empleado e) {
		return super.getSueldo(e) + e.getPorcVenta() * e.getVentas();
	}

}
