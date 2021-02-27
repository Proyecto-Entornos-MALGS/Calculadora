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
	void testResta2Enteros() {
		Resta rest = new Resta();
		int num1 = 3;
		int num2 = 2;
		int esperado = 1;
		assertEquals(esperado, rest.resta2Enteros(num1, num2));	
	
	}

	@Test
	void testResta3Reales() {
		Resta rest = new Resta();
		double num1 = 18.2;
		double num2 = 12.3;
		double num3 = 2.5;
		double esperado = 3.4;
		assertEquals(esperado, rest.resta3Reales(num1, num2, num3));
	}

	@Test
	void testAcumulador() {
		fail("Not yet implemented");
	}

	@Test
	void testAcumulado() {
		fail("Not yet implemented");
	}
}
