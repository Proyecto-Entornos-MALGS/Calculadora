package testOperaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Suma;

class TestSuma {

	@Test
	void testSumaValoresReales() {
		Suma sum = new Suma();
		double num1 = 2.3;
		double num2 = 7.7;
		double esperado = 10;
		assertEquals(esperado, sum.esSumaValoresReales(num1, num2));
		
	}

	@Test
	void testSumaValoresEnteros() {
		Suma sum = new Suma();
		int num1 = 8;
		int num2 = 9;
		double esperado = 17;
		assertEquals(esperado, sum.esSumaValoresReales(num1, num2));	
	
	}

	@Test
	void testSumaMultiple() {
		Suma sum = new Suma();
		double num1 = 8.2;
		double num2 = 9.3;
		double num3 = 3.5;
		double esperado = 21;
		assertEquals(esperado, sum.esSumaMultiple(num1, num2, num3));
	}

	@Test
	void testSumaAcumulador() {
		fail("Not yet implemented");
	}

	@Test
	void getAcumulador() {
		fail("Not yet implemented");
	}
}
