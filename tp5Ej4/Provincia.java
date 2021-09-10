package tp5Ej4;

import java.util.ArrayList;

public class Provincia {
	private String nombre;
	private ArrayList<Ciudad> ciudades;
	private static int minHab = 100000;

	public boolean provinciaDeficit() {
		int contador = 0;
		for (int i = 0; i < ciudades.size(); i++) {
			if ((ciudades.get(i).tieneDeficit())
					&& (ciudades.get(i).getCantHabitantes() > minHab)) {
				contador++;
			}
		}
		return (contador > (ciudades.size() * 0.5));
	}

	public void addCiudad(Ciudad c) {
		ciudades.add(c);
	}

	public static int getMinHab() {
		return minHab;
	}

	public static void setMinHab(int minHab) {
		Provincia.minHab = minHab;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia(String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<Ciudad>();
	}


}
