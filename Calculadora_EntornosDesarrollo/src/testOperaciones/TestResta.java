package testOperaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Resta;

class TestResta {

	Resta rest = new Resta();

	@Test
	void testResta2Reales() {
		double num1 = 3.0;
		double num2 = 2.0;
		double esperado = 1.0;
		assertEquals(esperado, rest.resta2Reales(num1, num2));
	}

	@Test
	void testResta2Enteros() {
		int num1 = 3;
		int num2 = 2;
		int esperado = 1;
		assertEquals(esperado, rest.resta2Enteros(num1, num2));	
	
	}

	@Test
	void testResta3Reales() {
		double num1 = 18.0;
		double num2 = 12.0;
		double num3 = 2.0;
		double esperado = 4.0;
		assertEquals(esperado, rest.resta3Reales(num1, num2, num3));
	}

	@Test
	void testGetAcumulado() {
		double num1 = 20.5;
		double num2 = 18.5;
		rest.acumulador(num1);
		rest.acumulador(num2);
		double esperado = -39;
		assertEquals(esperado, rest.getAcumulado());
	}
}
