import operaciones.*;

public class calculadora {
	public static void main(String[] args) {
		
		Operacion calcu= new Operacion();
		Suma sumar = new Suma();
		Resta restar = new Resta();
		Multiplicacion multi = new Multiplicacion();
		Cociente division = new Cociente();
		
		
		//pruebas
		System.out.println("---PRUEBAS MULTIPLICACION---");
		System.out.println(multi.twoRealNumbersProduct(16.2, 2.5));
		System.out.println(multi.twoIntegerNumersProduct(16, 2));
		System.out.println(multi.threeRealNumbersProduct(16.2F, 2.6F, 2.1F));
		System.out.println(multi.exponent(16, 2));
		System.out.println("---PRUEBAS OPERACIONES ESPECIALES---");
		System.out.println(calcu.esFactorial(20));
		System.out.println(calcu.esPorcentaje(25, 100));
		System.out.println(calcu.esPrimo(3));
		System.out.println(calcu.iesimoPrimo(20));
		System.out.println("---PRUEBAS COCIENTE---");
		System.out.println(division.dividirReales(10.5, 2.37));
		System.out.println(division.dividirEnteros(27, 3));
		System.out.println(division.Inverso(45));
		System.out.println(division.Raiz(125));
		System.out.println("---PRUEBAS SUMA---");
		System.out.println(sumar.esSumaValoresReales(1.3, 1.6));
		System.out.println(sumar.esSumaValoresEnteros(10, 20));
		System.out.println(sumar.esSumaMultiple(1.3, 4.5, 5.7));
		sumar.esSumaAcumulador(10);
		sumar.esSumaAcumulador(15);
		System.out.println(sumar.getAcumulador());
		
		
		
		
		
		
		
		
	}

	
	}


