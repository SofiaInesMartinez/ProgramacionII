package tp5Ej3;

import java.util.ArrayList;

public class ListaMinerales {
	private ArrayList<String> minerales;

	public boolean cumpleMinerales(Lote l) {
		for (int i = 0; i < minerales.size(); i++) {
			if (!l.tieneMineral(minerales.get(i))) {
				return false;
			}
		}
		return true;
	}

	public boolean tieneMineral(String m) {
		return minerales.contains(m);
	}

	public void addMineral(String m) {
		minerales.add(m);
	}

	public ListaMinerales() {
		this.minerales = new ArrayList<String>();
	}
}
