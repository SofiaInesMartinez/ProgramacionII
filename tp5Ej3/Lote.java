package tp5Ej3;

import java.util.ArrayList;

public class Lote {
	private int id;
	private ArrayList<String> minerales;
	private int superficie;
	private static ListaMinerales mineralesPrimarios;
	private static ListaCereales cerealesTemporada;

	public boolean sirveParaCereal(Cereal c) {
		return c.puedeSembrarse(this);
	}

	public boolean esEspecial() {
		if (mineralesPrimarios != null) {
			return mineralesPrimarios.cumpleMinerales(this);
		} else
			return false;
	}

	public ArrayList<String> getCerealesPosibles() {
		return cerealesTemporada.getCerealesPosibles(this);
	}

	public boolean tieneMineral(String m) {
		return minerales.contains(m);
	}

	public void addMineral(String m) {
		minerales.add(m);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public static void setMineralesPrimarios(ListaMinerales lm) {
		Lote.mineralesPrimarios = lm;
	}

	public static void setCerealesTemporada(ListaCereales lc) {
		Lote.cerealesTemporada = lc;
	}

	public Lote(int id, int superficie) {
		this.id = id;
		this.superficie = superficie;
		this.minerales = new ArrayList<String>();
	}

}
