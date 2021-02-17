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
	 * Multiplicación de dos números reales
	 * @param coefficientOne Numero real. Primer factor de la multiplicación
	 * @param coefficientTwo Numero real. Segundo factor de la multiplicación
	 * @return  Numero real. Resultado de la operación de multiplicación
	 */
	public float twoRealNumbersProduct(float coefficientOne, float coefficientTwo) {
		float result = coefficientOne * coefficientTwo;
		return result;
	} // Cierre del método
	
	/**
	 * Multiplicación de dos números enteros
	 * @param coefficientOne Numero entero. Primer factor de la multiplicación
	 * @param coefficientTwo Numero entero. Segundo factor de la multiplicación
	 * @return  Numero entero. Resultado de la operación de multiplicación
	 */
	public int twoIntegerNumersProduct(int coefficientOne, int coefficientTwo) {
		int result = coefficientOne * coefficientTwo;
		return result;
	} // Cierre del método
	
	/**
	 * Multiplicación de tres números reales
	 * @param coefficientOne Primer factor de la multiplicación
	 * @param coefficientTwo Segundo factor de la multiplicación
	 * @param coefficientThree Tercer factor de la multiplicación
	 * @return Resultado de la operación de multiplicación
	 */
	public float threeRealNumbersProduct(float coefficientOne, float coefficientTwo, float coefficientThree) {
		float result = coefficientOne * coefficientTwo * coefficientThree;
		return result;
	} // Cierre del método
	
	/**
	 * Potencia de dos números reales
	 * @param coefficientOne Base de la potencia
	 * @param coefficientTwo Exponente de la potencia
	 * @return Resultado de la operación base elevado a exponente
	 */
	public double exponent(float base, float exponent) {
		double result =  Math.pow(base, exponent);
		return result;
	} // Cierre del método
	
} // Cierre de la clase

