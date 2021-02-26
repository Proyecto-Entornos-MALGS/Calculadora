package testOperaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Suma;

class TestSuma {

	@Test
	void esSumaValoresReales() {
		Suma sum = new Suma();
		double num1 = 2.3;
		double num2 = 7.7;
		double esperado = 10;
		assertEquals(esperado, sum.esSumaValoresReales(num1, num2));
		
	}

	@Test
	void esSumaValoresEnteros() {
		Suma sum = new Suma();
		int num1 = 8;
		int num2 = 9;
		double esperado = 17;
		assertEquals(esperado, sum.esSumaValoresReales(num1, num2));	
	
	}

	@Test
	void esSumaMultiple() {
		fail("Not yet implemented");
	}

	@Test
	void esSumaAcumulador() {
		fail("Not yet implemented");
	}

	@Test
	void getAcumulador() {
		fail("Not yet implemented");
	}
}
