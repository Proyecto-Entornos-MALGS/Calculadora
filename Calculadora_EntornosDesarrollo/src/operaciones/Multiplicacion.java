package operaciones;

/**
 * 
 * Clase dedicada a operaciones de producto.
 * 
 * @author A.Sergio
 * @version 1.0
 * @since jan2021
 *
 */
public class Multiplicacion {

	
	/**
	 * Multiplicacion de dos numeros reales
	 * 
	 * Este metodo calcula el producto real de dos numeros reales
	 * posee retorno de tipo foat y con valores de entrada o resultados
	 * decimales mayores de 32 bits tendra un resultado erroneo
	 *  
	 * @param coefficientOne Numero real. Primer factor de la multiplicacion
	 * @param coefficientTwo Numero real. Segundo factor de la multiplicacion
	 * @return  Numero real. Resultado de la operacion de multiplicacion
	 */
	public float twoRealNumbersProduct(float coefficientOne, float coefficientTwo) {
		float result = coefficientOne * coefficientTwo;
		return result;
	} // Cierre del metodo
	
	/**
	 * Multiplicacion de dos numeros enteros
	 * 
	 * Este metodo permite multiplicar dos numeros enteros
	 * 
	 * Retorna un integer, por ello puede calcular numeros entre los valores +-2exp31
	 * retornando un resultado erróneo con resultados o parametros fuera de ese rango
	 * 
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
	 * 
	 * este metodo calcula el producto de tres valores retornando un float
	 * y por ello resultados o valores de entrada mayores de 32 bits 
	 * arrojaran resultados erroneos
	 * 
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
	 * 
	 * este metodo calcula la potencia "exponent" en base "base"
	 * si el metodo recibe o trata de retornar un valor superior
	 * a los 64 bits en numero decimal retornara un calculo erroneo
	 * 
	 * @param base Base de la potencia
	 * @param exponent Exponente de la potencia
	 * @return Resultado de la operacionn base elevado a exponente
	 */
	public double exponent(float base, float exponent) {
		double result =  Math.pow(base, exponent);
		return result;
	} // Cierre del metodo
	
} // Cierre de la clase

