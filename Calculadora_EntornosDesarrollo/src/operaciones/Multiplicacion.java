package operaciones;

/**
 * 
 * Clase dedicada a operaciones de producto.
 * @author A.Sergio
 * @version 1.0
 * @since jan2021
 *
 */
public class Multiplicacion {

	
	/**
	 * Multiplicaci�n de dos n�meros reales
	 * @param coefficientOne Numero real. Primer factor de la multiplicaci�n
	 * @param coefficientTwo Numero real. Segundo factor de la multiplicaci�n
	 * @return  Numero real. Resultado de la operaci�n de multiplicaci�n
	 */
	public float twoRealNumbersProduct(float coefficientOne, float coefficientTwo) {
		float result = coefficientOne * coefficientTwo;
		return result;
	} // Cierre del m�todo
	
	/**
	 * Multiplicaci�n de dos n�meros enteros
	 * @param coefficientOne Numero entero. Primer factor de la multiplicaci�n
	 * @param coefficientTwo Numero entero. Segundo factor de la multiplicaci�n
	 * @return  Numero entero. Resultado de la operaci�n de multiplicaci�n
	 */
	public int twoIntegerNumersProduct(int coefficientOne, int coefficientTwo) {
		int result = coefficientOne * coefficientTwo;
		return result;
	} // Cierre del m�todo
	
	/**
	 * Multiplicaci�n de tres n�meros reales
	 * @param coefficientOne Primer factor de la multiplicaci�n
	 * @param coefficientTwo Segundo factor de la multiplicaci�n
	 * @param coefficientThree Tercer factor de la multiplicaci�n
	 * @return Resultado de la operaci�n de multiplicaci�n
	 */
	public float threeRealNumbersProduct(float coefficientOne, float coefficientTwo, float coefficientThree) {
		float result = coefficientOne * coefficientTwo * coefficientThree;
		return result;
	} // Cierre del m�todo
	
	/**
	 * Potencia de dos n�meros reales
	 * @param coefficientOne Base de la potencia
	 * @param coefficientTwo Exponente de la potencia
	 * @return Resultado de la operaci�n base elevado a exponente
	 */
	public double exponent(float base, float exponent) {
		double result =  Math.pow(base, exponent);
		return result;
	} // Cierre del m�todo
	
} // Cierre de la clase

