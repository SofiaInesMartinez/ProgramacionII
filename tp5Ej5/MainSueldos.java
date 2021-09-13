package tp5Ej5;

public class MainSueldos {

	public static void main(String[] args) {
		Empleado e1 = new Empleado ("A", "A", 111, 20000, 50000, 3, 100);
		Empleado e2 = new Empleado ("B", "B", 112, 20000);
		Empleado e3 = new Empleado ("C", "C", 113, 20000, 80000, 2);
		
		NominaEmpleados ne = new NominaEmpleados();
		ne.addEmpleado(e1);
		ne.addEmpleado(e2);
		ne.addEmpleado(e3);
		
		System.out.println("AA - Sueldo bono: "+e1.getSueldo());
		System.out.println("BB - Sueldo basico: " + e2.getSueldo());
		System.out.println("CC - Sueldo ventas: " + e3.getSueldo());
		System.out.println("Total gastos en sueldos: " + ne.sumaTotalSueldos());
		
		e2.setVentas(80000);
		e2.setPorcVenta(2);
		e2.setSueldo(new SueldoVentas());
		System.out.println("BB ahora pasa a Ventas. Sueldo: " + e2.getSueldo());
		
		
		

	}

}
