package tp5Ej2;

public class CasaEnemiga extends Casa {
	private Casa casaEnemiga;
	
	public boolean alumnoAptoCasaEnemiga(Alumno a, Casa c) {
		return c.alumnoAptoCasa(a);		
	}
	
	public boolean alumnoAptoCasa(Alumno a) {
		return super.alumnoAptoCasa(a)&&!alumnoAptoCasaEnemiga(a, casaEnemiga);		
	}
	
	
	public String getNombreCasaEnemiga() {
		return casaEnemiga.getNombre();
	}

	public void setCasaEnemiga(Casa casaEnemiga) {
		this.casaEnemiga = casaEnemiga;
	}

	public CasaEnemiga(String nombre, int maxAlumnos, Casa casaEnemiga) {
		super(nombre, maxAlumnos);
		this.casaEnemiga = casaEnemiga;
	}

}
