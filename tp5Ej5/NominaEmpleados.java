package tp5Ej5;

import java.util.ArrayList;

public class NominaEmpleados {
	private ArrayList<Empleado> empleados;

	public void addEmpleado(Empleado e) {
		empleados.add(e);
	}

	public double sumaTotalSueldos() {
		double totalSueldos = 0;
		for (int i = 0; i < empleados.size(); i++) {
			totalSueldos += empleados.get(i).getSueldo();
		}
		return totalSueldos;
	}

	public NominaEmpleados() {
		this.empleados = new ArrayList<Empleado>();
	}

}
