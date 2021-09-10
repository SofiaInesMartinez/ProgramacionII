package tp5Ej2;

import java.util.ArrayList;

public class Casa {
	protected String nombre;
	protected int maxAlumnos;
	protected ArrayList<Alumno> alumnos;
	protected ArrayList<String> cualidadesCasa;

	public void addCualidad(String cualidad) {
		cualidadesCasa.add(cualidad);
	}

	public boolean tieneAlumno(Alumno a) {
		return alumnos.contains(a);
	}

	public boolean hayLugar() {
		return alumnos.size() < maxAlumnos;
	}

	public boolean alumnoAptoCasa(Alumno a) {
		return (hayLugar() && !a.tieneCasa() && alumnoTieneCualidades(a));
	}

	public boolean alumnoTieneCualidades(Alumno a) {
		for (int i = 0; i < cualidadesCasa.size(); i++) {
			if (!a.tieneCualidad(cualidadesCasa.get(i))) {
				return false;
			}
		}
		return true;
	}

	public void addAlumno(Alumno a) {
		if (this.alumnoAptoCasa(a)) {
			this.alumnos.add(a);
			a.setCasa(this);
		}
	}

	public ArrayList<String> getAlumnos(){
		ArrayList <String> listaAlumnos = new ArrayList<>();
		for (int i = 0; i < alumnos.size(); i++) {
			String nombreAlumno = alumnos.get(i).getNombre();
			listaAlumnos.add(nombreAlumno);
		}
		return listaAlumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Casa(String nombre, int maxAlumnos) {
		this.nombre = nombre;
		this.alumnos = new ArrayList<Alumno>();
		this.maxAlumnos = maxAlumnos;
		this.cualidadesCasa = new ArrayList<String>();
	}

}
