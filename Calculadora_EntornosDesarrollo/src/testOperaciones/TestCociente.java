package testOperaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Cociente;

class TestCociente {
	Cociente coci = new Cociente();
	
	
	@Test
	void testDividirReales() {
		int num1 = 5;
		int num2 = 2;
		double esperado = 2.5;
		double obtenido = coci.DividirReales(num1, num2);
		assertEquals(esperado,obtenido, "La division entre 5 y 2 debe ser 2.5");
	}

	@Test
	void testDividirEnteros() {
		int x = 6;
		int y = 3;
		int esperado = 2;
		int obtenido = coci.DividirEnteros(x, y);
		assertEquals(esperado, obtenido, "la diviision entre 6 y 3 debe ser 2");
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
