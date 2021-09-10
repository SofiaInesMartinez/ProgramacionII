package tp5Ej3;

import java.util.ArrayList;

public class Cereal {
	protected String nombre;
	protected ArrayList<String> mineralesRequeridos;
	

	public boolean puedeSembrarse(Lote l){
		for (int i = 0; i < mineralesRequeridos.size(); i++) {
			if (!l.tieneMineral(mineralesRequeridos.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	public void addMineralRequerido (String m){
		mineralesRequeridos.add(m);
	}
	
	public boolean requiereMineral (String m){
		return mineralesRequeridos.contains(m);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cereal(String nombre) {
		this.nombre = nombre;
		this.mineralesRequeridos = new ArrayList<String>();
	}
	
}
