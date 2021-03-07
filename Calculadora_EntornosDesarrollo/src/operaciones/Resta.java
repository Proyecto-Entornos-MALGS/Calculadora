package operaciones;
/** 
 * Clase dedicada a operaciones de restar.
 * @author albertomascaraque
 * @version 1.0
 * @since jan2021
 */
public class Resta {
	
	

	private double acumulado=0;


	/**
	 * Por un problema de precision de Java, el resultado no siempre es exacto
	 * y se obtiene un error. En proximas verisones para solventar este problema
	 * se creara como clase BigDecimal.
	 * 
	 * metodo que contiene la resta de dos reales
	 * @param x variable de entrada, primer elemento en la operacion
	 * @param y variable de entrada, segundo elemento en la operacion
	 * @return es el resultado
	 */
	public double resta2Reales(double x, double y) {
		return x-y;
	}	

	/**
	 * metodo que contiene la resta de dos enteros
	 * @param x variable de entrada, primer elemento en la operacion
	 * @param y variable de entrada, segundo elemento en la operacion
	 * @return es el resultado
	 */
	public int resta2Enteros(int x, int y) {
		return x-y;
	}	

	/**
	 * 	 * Por un problema de precision de Java, el resultado no siempre es exacto
	 * y se obtiene un error. En proximas verisones para solventar este problema
	 * se creara como clase BigDecimal.
	 * metodo que contiene la resta de tres reales
	 * @param x variable de entrada, primer elemento en la operacion
	 * @param y variable de entrada, segundo elemento en la operacion
	 * @param z variable de entrada, tercer elemento en la operacion
	 * @return es el resultado
	 */
	public double resta3Reales(double x, double y, double z) {
		return x-y-z;
	}	

	/**
	 * metodo que contiene la resta del acumulado con una variable 
	 * @param x variable de entrada
	 */
	public void acumulador(double x) {
		this.acumulado-=x;
	}
	
	/**
	 * 
	 * @return  Nos devuelve el valor acumulado.
	 */
	public double getAcumulado() {
		return acumulado;
	}


	

}



