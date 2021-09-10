package tp5Ej3;

public class Pastura extends Cereal {
	private static int superficieMinima = 50;

	public boolean puedeSembrarse(Lote l) {
		return (super.puedeSembrarse(l) && (l.getSuperficie() > superficieMinima));
	}

	public static int getSuperficieMinima() {
		return superficieMinima;
	}

	public static void setSuperficieMinima(int superficieMinima) {
		Pastura.superficieMinima = superficieMinima;
	}

	public Pastura(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

}
