package testOperaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Cociente;

class TestCociente {

	@Test
	void testDividirReales() {
		Cociente coci = new Cociente();
		int num1 = 5;
		int num2 = 2;
		double esperado = 2.5;
		assertEquals(esperado, coci.DividirReales(num1, num2));
	}

	@Test
	void testDividirEnteros() {
		fail("Not yet implemented");
	}

	@Test
	void testInverso() {
		fail("Not yet implemented");
	}

	@Test
	void testRaiz() {
		fail("Not yet implemented");
	}

}
