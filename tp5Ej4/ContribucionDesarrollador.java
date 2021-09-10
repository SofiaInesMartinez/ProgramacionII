package tp5Ej4;

public class ContribucionDesarrollador extends Contribucion {

	private static double porcDesarrollo = 0.02;
	private static double porcMontoFijo = 0.2;

	@Override
	public double calcularContribucion(Contribuyente c1) {
		return c1.getMontoFijo() * porcMontoFijo + c1.getVentas()
				* porcDesarrollo;
	}

	public static double getPorcDesarrollo() {
		return porcDesarrollo;
	}

	public static void setPorcDesarrollo(double porcDesarrollo) {
		ContribucionDesarrollador.porcDesarrollo = porcDesarrollo;
	}

	public static double getPorcMontoFijo() {
		return porcMontoFijo;
	}

	public static void setPorcMontoFijo(double porcMontoFijo) {
		ContribucionDesarrollador.porcMontoFijo = porcMontoFijo;
	}

	
}
