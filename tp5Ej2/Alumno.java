package tp5Ej2;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private ArrayList<String> cualidadesAlumno;
	private ArrayList<Alumno> familiares;
	private Casa casa;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean tieneCualidad(String cualidad) {
		return cualidadesAlumno.contains(cualidad);
	}

	public void addCualidadAlumno(String cualidad) {
		this.cualidadesAlumno.add(cualidad);
	}

	public boolean esFamiliar(Alumno a) {
		return familiares.contains(a);
	}

	public void addFamiliar(Alumno a) {
		this.familiares.add(a);
		a.familiares.add(this);
	}

	public boolean tieneCasa() {
		return (casa != null);
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	public String getNombreCasa() {
		return casa.getNombre();
	}

	public Alumno(String nombre) {
		this.nombre = nombre;
		this.cualidadesAlumno = new ArrayList<String>();
		this.familiares = new ArrayList<Alumno>();
	}

}
