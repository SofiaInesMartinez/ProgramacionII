package tp5Ej5;

public class SueldoBono extends SueldoVentas {

	public double getSueldo(Empleado e) {
		if (e.recibeBono()) {
			return super.getSueldo(e) + e.getBono();
		}else return super.getSueldo(e);
	}

}
