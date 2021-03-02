import operaciones.*;

public class calculadora {
	public static void main(String[] args) {
		
		Operacion calcu= new Operacion();
		Suma sumar = new Suma();
		Resta restar = new Resta();
		Multiplicacion multi = new Multiplicacion();
		Cociente division = new Cociente();
		
		
		//pruebas
		
		
		System.out.println(calcu.iesimoPrimo(1));
		
		System.out.println(division.dividirReales(16.3, 2.65));
		
		System.out.println(multi.twoRealNumbersProduct(16.2, 2.5));
		System.out.println(multi.twoIntegerNumersProduct(16, 2));
		System.out.println(multi.threeRealNumbersProduct(16.2F, 2.6F, 2.1F));
		System.out.println(multi.exponent(16, 2));

		
		
		
		
		
		
		
		
		
	}

	
	}


