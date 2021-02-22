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
	 * Multiplicacion de dos numeros reales
	 * @param coefficientOne Numero real. Primer factor de la multiplicacion
	 * @param coefficientTwo Numero real. Segundo factor de la multiplicacion
	 * @return  Numero real. Resultado de la operacion de multiplicacion
	 */
	public float twoRealNumbersProduct(float coefficientOne, float coefficientTwo) {
		float result = coefficientOne * coefficientTwo;
		return result;
	} // Cierre del m�todo
	
	/**
	 * Multiplicacion de dos numeros enteros
	 * @param coefficientOne Numero entero. Primer factor de la multiplicacion
	 * @param coefficientTwo Numero entero. Segundo factor de la multiplicacion
	 * @return  Numero entero. Resultado de la operacion de multiplicacion
	 */
	public int twoIntegerNumersProduct(int coefficientOne, int coefficientTwo) {
		int result = coefficientOne * coefficientTwo;
		return result;
	} // Cierre del metodo
	
	/**
	 * Multiplicacion de tres numeros reales
	 * @param coefficientOne Primer factor de la multiplicacion
	 * @param coefficientTwo Segundo factor de la multiplicacion
	 * @param coefficientThree Tercer factor de la multiplicacion
	 * @return Resultado de la operacion de multiplicacion
	 */
	public float threeRealNumbersProduct(float coefficientOne, float coefficientTwo, float coefficientThree) {
		float result = coefficientOne * coefficientTwo * coefficientThree;
		return result;
	} // Cierre del metodo
	
	/**
	 * Potencia de dos numeros reales
	 * @param coefficientOne Base de la potencia
	 * @param coefficientTwo Exponente de la potencia
	 * @return Resultado de la operacionn base elevado a exponente
	 */
	public double exponent(float base, float exponent) {
		double result =  Math.pow(base, exponent);
		return result;
	} // Cierre del metodo
	
} // Cierre de la clase

