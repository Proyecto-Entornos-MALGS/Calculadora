package testOperaciones;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Operacion;

class TestOperaciones {

	Operacion opr = new Operacion();
	
	//esPrimoTEST

	@Test
	void testEsPrimo() {
		int num1 = 3;
		int num2 = 10;

		assertTrue(opr.esPrimo(num1));
		assertFalse(opr.esPrimo(num2));
	}

	
	//IesimoPrimoTEST

	@Test
	void IesimoPrimo() {
		int num1=5;
		String output = opr.iesimoPrimo(num1);
		assertEquals(output, "El numero primo " + num1 + "# es: 11");
		
	}
	
	//esFactorialTEST
	
	@Test
	void tieneQueSacarelPorcentajequeSon10eurosDeCien() {
		
		//2 Act - Ejecutar
		
			double num1 = 10;
			double num2 = 100;
			
			String porcentaje = opr.esPorcentaje(num1, num2);
			String esperado = "10.0 %";
			
		//3 Assert - comprobar
			assertEquals(esperado, porcentaje);
		
	}
	
	@Test
	
	void probamosElResultadoConNumerosNegativos() {
		
		//2 Act - Ejecutar
		
			double num1 = -10;
			double num2 = 100;
			
			String porcentaje = opr.esPorcentaje(num1, num2);
			String esperado = "-10.0 %";
			
		//3 Assert - comprobar
			assertEquals(esperado, porcentaje);
		
	}
	
	
	@Test
	
	void probamosConElTotalNegativo() {
		
		//2 Act - Ejecutar
		
			double num1 = 10;
			double num2 = -100;
			
			String porcentaje = opr.esPorcentaje(num1, num2);
			String esperado = "-10.0 %";
			
		//3 Assert - comprobar
			assertEquals(esperado, porcentaje);
			
	}
	
	// esFactorialTEST
	
	@Test
	
	void sacamosElFactorialDeCero() {
		
		//2 Act - Ejecutar
		
		int num = 0;
		
		String resultado = opr.esFactorial(num);
		String esperado = "El factorial es 1";
		
	//3 Assert - comprobar
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	
	void sacamosElFactorialDeunNumeroNegativo() {
		
		//2 Act - Ejecutar
		
		int num = -1;
		
		String resultado = opr.esFactorial(num);
		String esperado = "El factorial de -1 es: 1";
		
	//3 Assert - comprobar
		assertEquals(esperado, resultado);
		
	}
	
@Test
	
	void sacamosElFactorialDeunNumeroPositivo() {
		
		//2 Act - Ejecutar
		
		int num = 5;
		
		String resultado = opr.esFactorial(num);
		String esperado = "El factorial de 5 es: 120";
		
	//3 Assert - comprobar
		assertEquals(esperado, resultado);
		
	}
	
	
}
