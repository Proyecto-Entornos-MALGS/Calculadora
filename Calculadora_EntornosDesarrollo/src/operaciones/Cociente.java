package operaciones;
/**
 * Clase dedicada a divisiones.
 * @author Miguel
 * @version 1.0
 * @since jan2021
 */
public class Cociente {


	/**
	 * Lo gestiono con double al tener decimales
	 * @param x = variable numerica real
	 * @param y = variable numerica real
	 * @return nos devuelve la division entre las dos variable reales
	 */
	public double dividirReales(double x, double y) {
		return x/y;
	}
	
	
	/**
	 * Aunque este apartado pueda hacerlo con el anterior queria separar en numeros enteros y reales
	 * Si divides un numero entre 0 el resultado siempre dara infinito, que en una calculadora es igual a error
	 * Si divides cero entre un numero el resultado siempre sera 0
	 * @param x = variable numerica entero
	 * @param y = variable numerica entero
	 * @return nos devuelve la division entre las dos variable enteras
	 */
	public int dividirEnteros(int x, int y) {
		return x/y;
	}
	
	
	/**
	 * @param x = variable numerica entero
	 * @return nos devuelve el inverso del numero 
	 */	
	public double Inverso(int x) {
		return 1/x;
	}

	
	/**
	 * Math.sqrt es un metodo para hacer una raiz cuadrada
	 * @param x = variable numerica entero
	 * @return nos devuelve la raiz cuadrada del numero 
	 */
	public double Raiz(int x ) {
		return Math.sqrt(x);
	}
}



