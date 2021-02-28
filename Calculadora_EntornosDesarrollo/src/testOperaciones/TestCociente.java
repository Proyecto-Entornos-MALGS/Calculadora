package testOperaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Cociente;

class TestCociente {
	Cociente coci = new Cociente();
	
	
	@Test
	void testDividirReales() {
		int x = 5;
		int y = 2;
		double esperado = 2.5;
		double obtenido = coci.DividirReales(x, y);
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
	void dividirEntre0esInfinito() {
		double x = 5; 
		double y = 0;
		double esperado = (double) Double.POSITIVE_INFINITY;
		double obtenido = coci.DividirReales(x, y);
		assertEquals(esperado, obtenido);		
	}
	
	@Test
	void testInverso() {
		double x = 10;
		double esperado = 0.1;
		double obtenido = coci.Inverso(x);
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void testInversoNegativo() {
		double x = -10;
		double esperado = -0.1;
		double obtenido = coci.Inverso(x);
		assertEquals(esperado, obtenido);		
	}

	@Test
	void testRaiz() {
		int x = 25 ;
		int esperado = 5;
		double obtenido = coci.Raiz(x);
		assertEquals(esperado, obtenido);		
	}

}
