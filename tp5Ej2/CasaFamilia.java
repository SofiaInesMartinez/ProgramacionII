package tp5Ej2;

import java.util.ArrayList;

public class CasaFamilia extends Casa {
	protected ArrayList<Alumno> fundadores;
		
	public boolean alumnoAptoCasa(Alumno a) {
		return (super.alumnoAptoCasa(a)&&alumnoTieneFamiliares(a));		
	}
	
	public boolean alumnoTieneFamiliares(Alumno a) {
		for (int i = 0; i < this.alumnos.size(); i++) {
			if (a.esFamiliar(this.alumnos.get(i))) {
				return true;
			}
		}
		return false;
	}
	
	public void addAlumnoFundador(Alumno a){
		fundadores.add(a);
	}

	public CasaFamilia(String nombre, int maxAlumnos) {
		super(nombre, maxAlumnos);
		this.fundadores = new ArrayList<Alumno>();
		this.alumnos = fundadores;
	}
	
}
