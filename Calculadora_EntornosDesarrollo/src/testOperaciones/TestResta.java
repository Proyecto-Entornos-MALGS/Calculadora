package testOperaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Resta;

class TestResta {

	@Test
	void testResta2Reales() {
		Resta rest = new Resta();
		double num1 = 3.3;
		double num2 = 2.1;
		double esperado = 1.2;
		assertEquals(esperado, rest.resta2Reales(num1, num2));
	}

	@Test
	void testSumaValoresEnteros() {
		fail("Not yet implemented");	
	
	}

	@Test
	void testSumaMultiple() {
		fail("Not yet implemented");
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
