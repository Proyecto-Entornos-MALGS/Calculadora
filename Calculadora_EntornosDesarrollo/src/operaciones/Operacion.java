package operaciones;
/**
 * Clase dedicada a operaciones especiales
 * @author guiller
 * @version 1.0
 * @since jan2021
 */
public class Operacion {
	
	
	/**
	 * Metodo que comprueba si el numero introducido es primo.
	 * Comprobara primero si el numero es par o <0 para reducir el campo de busqueda.
	 * @param num = Valor que se comprobara
	 * @return True = numero primo
	 * <p>False = no es numero primo
	 */
	public boolean esPrimo(int num) {
		
		    //revisa si num es multiplo de 2 o si es < que 0
		   	if (num % 2==0 || num<0) 
		    	return false;
		   
		    //si no, solo revisa los impares
		    for(int i=3;i*i<=num;i+=2) {
		        if(num % i==0)
		            return false;
		    }
		    return true;
		
	}
	/**
	 * Se implementara funcionalidad en futuras versiones.
	 * @deprecated
	 */
	public int iesimoPrimo(int num) {
		
		return num;
	}
	
	/**
	 * Metodo que sirve para saber el porcentaje de una cantidad sobre un total.
	 * @param num = cantidad que quieres hallar el porcentaje
	 * @param total = cantidad total sobre la que hallar el porcentaje
	 * @return Devuelve el %
	 */
	public String esPorcentaje(double num, double total) {
		double porcentaje=(num*100)/total;
		return porcentaje + " %";
	}
	
	/**
	 * Metodo para hallar el factorial de cualquier numero.
	 * <p>Si metemos el valor 0 nos devolvera su factorial que es 1.
	 * <p>Si metemos un numero negativo, lo transformara en numero positivo.
	 * @param num = numero que queremos sacar el factorial.
	 * @return El factorial del numero deseado.
	 */
	public String esFactorial(int num) {
		int factorial = 1;
		int numero=num;
		// el numero 0 al ser un producto nulo o vacio devolvera el valor 1.
		if (num==0) 
			return "El factorial es 1";
		
		else {
			if(num<0)                    
				num*=-1;
			while (num!=0) {
			  factorial*=num;
			  num--;
			}
		
		}return "El factorial de " + numero +" es: "+ factorial;
		
	}

}
