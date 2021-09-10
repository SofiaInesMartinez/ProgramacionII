package tp5Ej3;

public class MainCooperativa {

	public static void main(String[] args) {
		String m1 = "nitrógeno";
		String m2 = "fósforo";
		String m3 = "azufre";
		String m4 = "agua";
		String m5 = "oxígeno";

		ListaMinerales lm1 = new ListaMinerales();
		lm1.addMineral(m1);
		lm1.addMineral(m2);
		lm1.addMineral(m5);

		Cereal c1 = new Cereal("Trigo");
		c1.addMineralRequerido(m1);
		c1.addMineralRequerido(m2);
		c1.addMineralRequerido(m3);
		c1.addMineralRequerido(m4);

		Pastura c2 = new Pastura("Alfalfa");
		c2.addMineralRequerido(m1);
		c2.addMineralRequerido(m2);
		c2.addMineralRequerido(m3);

		ListaCereales lc1 = new ListaCereales();
		lc1.addCereal(c1);
		lc1.addCereal(c2);

		Lote.setMineralesPrimarios(lm1);
		Lote.setCerealesTemporada(lc1);

		Lote l1 = new Lote(123, 400);
		l1.addMineral(m1);
		l1.addMineral(m2);
		l1.addMineral(m3);

		Lote l2 = new Lote(111, 100);
		l2.addMineral(m1);
		l2.addMineral(m2);
		l2.addMineral(m3);
		l2.addMineral(m4);
		l2.addMineral(m5);

		ListaLotes ll1 = new ListaLotes();
		ll1.addLote(l1);
		ll1.addLote(l2);

		System.out.println("En el lote " + l1.getId() + " puede sembrarse "
				+ l1.getCerealesPosibles());
		System.out.println("En el lote " + l2.getId() + " puede sembrarse "
				+ l2.getCerealesPosibles());

		System.out.println("El cereal " + c1.getNombre()
				+ " puede sembrarse en los lotes " + ll1.getLotesPosibles(c1));
		System.out.println("El cereal " + c2.getNombre()
				+ " puede sembrarse en los lotes " + ll1.getLotesPosibles(c2));

		System.out.println("El lote " + l1.getId() + " es especial "
				+ l1.esEspecial());
		System.out.println("El lote " + l2.getId() + " es especial "
				+ l2.esEspecial());

	}

}
