package tp5Ej3;

import java.util.ArrayList;

public class ListaCereales {

	private ArrayList<Cereal> cereales;

	public boolean tieneCereal(Cereal c) {
		return cereales.contains(c);
	}

	public void addCereal(Cereal c) {
		cereales.add(c);
	}

	public ArrayList<String> getCerealesPosibles(Lote l) {
		ArrayList<String> cerealesPosibles = new ArrayList<String>();
		for (int i = 0; i < cereales.size(); i++) {
			if (l.sirveParaCereal(cereales.get(i))) {
				String cereal = cereales.get(i).getNombre();
				cerealesPosibles.add(cereal);
			}
		}
		return cerealesPosibles;
	}
	
	public ListaCereales() {
		this.cereales = new ArrayList<Cereal>();
	}
}
