package tp5Ej4;

public class ContribucionComerciante extends Contribucion {
	private static double porcFacturacion = 0.035;
	private static double porcMontoFijo = 0.5;
	
	@Override
	public double calcularContribucion(Contribuyente c1) {
		return c1.getMontoFijo()*porcMontoFijo+c1.getVentas()*porcFacturacion;
	}

	public static double getPorcFacturacion() {
		return porcFacturacion;
	}

	public static void setPorcFacturacion(double porcFacturacion) {
		ContribucionComerciante.porcFacturacion = porcFacturacion;
	}

	public static double getPorcMontoFijo() {
		return porcMontoFijo;
	}

	public static void setPorcMontoFijo(double porcMontoFijo) {
		ContribucionComerciante.porcMontoFijo = porcMontoFijo;
	}

	
}
