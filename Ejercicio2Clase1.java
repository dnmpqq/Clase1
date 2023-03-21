package paquetelecalse2ejercicios;

public class Ejercicio2Clase1 {

	public static void main(String[] args) {
		int Ingresomensual=489083;
		boolean autos3= false,casa3=false,aeronavelujo=false,activos=false;
		
		if (Ingresomensual>=489083 && autos3 == true && casa3 == true && aeronavelujo==true && activos==true ) {
			System.out.println("La persona pertence al segmento ingresos altos. Pertenece a la clase i");
		} 
		else if (Ingresomensual>=489083 && autos3 == true && casa3 == true || aeronavelujo==true || activos==true ) {
			System.out.println("La persona pertence al segmento ingresos altos. Pertenece a la clase ii");
		} 
		else if (Ingresomensual>=489083 || autos3 == true || casa3 == true || aeronavelujo==true || activos==true ) {
			System.out.println("La persona pertence al segmento ingresos altos. Pertenece a la clase iii");
		} 
		else System.out.println("La persona no pertenece al segmo de clase alta");
	}

}
