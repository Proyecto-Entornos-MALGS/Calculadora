import operaciones.*;

public class calculadora {
	public static void main(String[] args) {
		
		Operacion calcu= new Operacion();
		Suma sumar = new Suma();
		Resta restar = new Resta();
		Multiplicacion multi = new Multiplicacion();
		Cociente division = new Cociente();
		
		
		//pruebas
		System.out.println(calcu.esFactorial(50));
		System.out.println(calcu.esFactorial(-3));
		System.out.println(calcu.esPrimo(3));
		System.out.println(calcu.esPorcentaje(-500, -100));
		
		System.out.println(division.DividirEnteros(5, 5));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	}


