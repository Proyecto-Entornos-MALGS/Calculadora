package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicacionTest {
	
	Multiplicacion multi = new Multiplicacion();
	
	/*
	 * ¿Qué ocurre si multiplicamos de numeros reales?
	 * El resultado puede variar en real o entero, dependiendo los numeros agregados a la operación
	 */
	@Test
	void DosNumerosRealesMultiplicadosPositivosDaResultadoPositivo() {
		//Arrange - Preparar
		double x = 2.5;   	//numero real o con decimal
		double y = 4.80;	//numero real o con decimal
		double esperado = 12;	//resultado que puede ser real o entero
		//Act - Ejecutar
		double obtenido = multi.twoRealNumbersProduct(x,y); 	//operacion matemática, llamando a metodo
		//Assert - Comprobar
		assertEquals(esperado,obtenido,"La multiplicacion tiene que ser 12");	
	}
	
	
	/**
	 * ¿Multiplicación con un numero negativo?
	 * El resultado saldrá negativo siempre
	 */
	@Test
	void MultiplicacionDeUnNumeroPositivoYOtroNegrativoDaComoResultadoNegativo() {
		//Arrange - Preparar
		int x = -2;  //numero negativo
		int y = 4;	//numero positivo
		int esperado = -8;		//resultado siempre negativo
		//Act - Ejecutar
		int obtenido = multi.twoIntegerNumersProduct(x,y);   //operacion matemática, llamando a metodo
		//Assert - Comprobar
		assertEquals(esperado,obtenido,"La multiplicacion tiene que ser -8");	
	}
	
	
	/**
	 * ¿Multiplicación con dos numeros negativos?
	 * El resultado saldra positivo siempre
	 */
	@Test
	void MultiplicacionDeDosNumerosNegrativosDaComoResultadoPositivo() {
		//Arrange - Preparar
		int x = -2;	//numero negativo
		int y = -4;	//numero negativo
		int esperado = 8;		//resultado siempre positivo
		//Act - Ejecutar
		int obtenido = multi.twoIntegerNumersProduct(x,y);   //operacion matemática, llamando a metodo
		//Assert - Comprobar
		assertEquals(esperado,obtenido,"La multiplicacion tiene que ser 8");	
	}
	
	
	/**
	 * ¿Multiplicación de tres numeros?
	 * Si el resultado fuera muy alto se cambia el double por float
	 */
	@Test
	void MultiplicacionDeTresNumerosDaComoResultado50() {
		//Arrange - Preparar
		float x = 5;
		float y = 5;
		float z = 2;
		float esperado = 50;
		//Act - Ejecutar
		float obtenido = multi.threeRealNumbersProduct(x,y,z);   //operacion matemática, llamando a metodo
		//Assert - Comprobar
		assertEquals(esperado,obtenido,"La multiplicacion tiene que ser 50");	
	}
	
	
	/**
	 * ¿Qué ocurre si una potencia es muy grande?
	 * te da como resultado un float o un numero con exponentes
	 */
	@Test
	void DosElevadoA30() {
		//Arrange - Preparar
		float x = 2;    //base de la potencia
		float y = 30;	//exponente de la potencia
		float esperado = 1073741824;	//resultado que es la potencia en sí
		//Act - Ejecutar
		float obtenido = multi.exponent(x,y);   //operacion matemática, llamando a metodo
		//Assert - Comprobar
		assertEquals(esperado,obtenido,"La multiplicacion tiene que ser 1073741824");	
	}
	
	
	/**
	 * ¿Qué ocurre si multiplico 0*0?
	 * el resultado siempre sera 0
	 */
	@Test
	void CeroPorCero() {
		//Arrange - Preparar
		int x = 0;
		int y = 0;
		int esperado = 0;
		//Act - Ejecutar
		int obtenido = multi.twoIntegerNumersProduct(x,y);   //operacion matemática, llamando a metodo
		//Assert - Comprobar
		assertEquals(esperado,obtenido,"La multiplicacion tiene que ser 0");
	}
	
	
	/**
	 * ¿Qué ocurre si multiplico un numero*0?
	 * el resultado siempre sera 0
	 */
	@Test
	void UnNumeroPorCero() {
		//Arrange - Preparar
		int x = 18;   //numero positivo o negativo, es indiferente, el resultado siempre sera cero
		int y = 0;
		int esperado = 0;
		//Act - Ejecutar
		int obtenido = multi.twoIntegerNumersProduct(x,y);   //operacion matemática, llamando a metodo
		//Assert - Comprobar
		assertEquals(esperado,obtenido,"La multiplicacion tiene que ser 0");	
	}
}
