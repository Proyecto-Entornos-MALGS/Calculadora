package operaciones;
/**
 * Esta clase realiza operaciones de suma con dos o tres parámetros.
 * @author Luz
 * @version 1.0
 * @since jan2021
 */
public class Suma {
	
	private int acumulador = 0;
	
	/**
	 * Se introducen dos parametros que realizaran la operación de suma.
	 * @param num1 = numero real 1
	 * @param num2 = numero real 2
	 * @return Devuelve la suma de num1 + num2.
	 */
	public double esSumaValoresReales(double num1, double num2) {
		
		return num1+num2;
	}
	
	/**
	 * Se introducen dos parametros que realizaran la operación de suma.
	 * @param num1 = numero entero 1
	 * @param num2 = numero entero 2
	 * @return Devuelve la suma de num1 + num2.
	 */
	public int esSumaValoresEnteros(int num1, int num2) {
		
		return num1+num2;
	}
	/**
	 * Se introducen tres parametros que realizaran la operación de suma.
	 * @param num1 = numero real 1
	 * @param num2 = numero real 2
	 * @param num3 = numero real 3
	 * @return Devuelve la suma de num1 + num2 + num3.
	 */
	public double esSumaMultiple(double num1, double num2,double num3) {
		
		return num1+num2+num3;
	}
	/**
	 * Se introduce un parametro que se acumula.
	 * @param num1 = numero entero 1
	 */
	public void esSumaAcumulador(int num1) {
		this.acumulador+=num1;
		
	}
	/**
	 * 
	 * @return  Nos devuelve el valor acumulado.
	 */
	public int getAcumulador() {
		return acumulador;
	}

	
	
	
}
