package tp5Ej3;

import java.util.ArrayList;

public class ListaLotes {
	private ArrayList<Lote> lotes;

	public boolean tieneLote(Lote l) {
		return lotes.contains(l);
	}

	public void addLote(Lote l) {
		lotes.add(l);
	}

	public ArrayList<Integer> getLotesPosibles(Cereal c) {
		ArrayList<Integer> lotesPosibles = new ArrayList<Integer>();
		for (int i = 0; i < lotes.size(); i++) {
			if (c.puedeSembrarse(lotes.get(i))) {
				int lote = lotes.get(i).getId();
				lotesPosibles.add(lote);
			}
		}
		return lotesPosibles;
	}

	public ListaLotes() {
		this.lotes = new ArrayList<Lote>();
	}
}
