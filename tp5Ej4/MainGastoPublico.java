package tp5Ej4;

public class MainGastoPublico {

	public static void main(String[] args) {
		Contribuyente cc1 = new Contribuyente ("A", 1111, 3000, 0, 0);
		Contribuyente cc2 = new Contribuyente ("B", 1112, 3000, 50000, 0);
		cc2.setContribucion(new ContribucionComerciante());
		Contribuyente cc3 = new Contribuyente ("C", 1113, 3000, 0, 70000);
		cc3.setContribucion(new ContribucionDesarrollador());
		
		
		Ciudad c1 = new Ciudad("Mar del Plata", 500000, 100);
		c1.addContribuyente(cc1);
		c1.addContribuyente(cc2);
		c1.addContribuyente(cc3);
		
		System.out.println("La recaudacion de la ciudad: " +c1.getNombre() +" es de " + c1.getRecaudación());
		System.out.println("La ciudad: " +c1.getNombre() +" tiene deficit: " + c1.tieneDeficit());
		
		System.out.println("Contribucion de cc1: " + cc1.getContribucion() );
		System.out.println("Contribucion de cc2: " + cc2.getContribucion() );
		System.out.println("Contribucion de cc3: " + cc3.getContribucion() );
		
		

	}

}
