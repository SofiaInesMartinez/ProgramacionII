package tp5Ej2;

public class MainHogwarts {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Harry");
		a1.addCualidadAlumno("valiente");
		
		Alumno a2 = new Alumno("Hermione");
		a2.addCualidadAlumno("valiente");
		a2.addCualidadAlumno("inteligente");
		a2.addFamiliar(a1);
		
		Alumno a3 = new Alumno("Ron");
		a3.addCualidadAlumno("valiente");
		a3.addCualidadAlumno("inteligente");
		a3.addCualidadAlumno("astuto");
		a3.addFamiliar(a2);
		
		Alumno a4 = new Alumno("Marcus");
		a4.addCualidadAlumno("valiente");
		//a4.addFamiliar(a2);
				
		Casa c1 = new Casa("Griffindor", 2);
		c1.addCualidad("astuto");
		System.out.println(a1.getNombre() + " es apto para casa " + c1.getNombre() + ": " + c1.alumnoAptoCasa(a1));
		c1.addAlumno(a1);
		c1.addAlumno(a2);
		c1.addAlumno(a3);
		System.out.println("Alumnos de la casa " + c1.getNombre() + ": " + c1.getAlumnos());
		
		CasaFamilia c2 = new CasaFamilia("Hufflepuff", 3);
		c2.addCualidad("valiente");
		c2.addAlumnoFundador(a1);
		c2.addAlumno(a3); //No lo agrega porque ya tiene casa
		System.out.println(a2.getNombre() + " es apto para casa " + c2.getNombre() + ": " + c2.alumnoAptoCasa(a2));
		c2.addAlumno(a2); //maxAlumnos funciona (cambiar a 1)
		System.out.println("Alumnos de la casa " + c2.getNombre() + ": " + c2.getAlumnos());
		System.out.println(a2.getNombreCasa()); //o cambiar a a2.getCasa().getNombre()?
//		System.out.println(a1.esFamiliar(a2));
//		System.out.println(a2.esFamiliar(a3));
		
		CasaEnemiga c3 = new CasaEnemiga("Ravenclaw", 2, c2);
		System.out.println(a3.getNombre() + " es apto para casa " + c3.getNombre() + ": " + c3.alumnoAptoCasa(a3));
		System.out.println(a4.getNombre() + " es apto para casa " + c3.getNombre() + ": " + c3.alumnoAptoCasa(a4));
		c3.addAlumno(a3);
		c3.addAlumno(a4);
		System.out.println("Alumnos de la casa " + c3.getNombre() + ": " + c3.getAlumnos());
		
	}

}
