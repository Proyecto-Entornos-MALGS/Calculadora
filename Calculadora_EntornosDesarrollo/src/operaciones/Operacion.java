package operaciones;

import java.math.BigInteger;
import java.util.Scanner;

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
	 * Metodo que te da el n-esimo primo que le pidas.
	 *
	 * <ul>
	 * <li>Introduciendo un valor igual o menor a 0, repite proceso hasta que le des un numero mayor
	 * <li>Numero mayor o igual a 1, te devolvera el numero primo en la posicion indicada.
	 * </ul>
	 * <p>Los 10 primeros numeros primos son : 2 - 3 - 5 - 7 - 11 - 13 - 17 - 19 - 23 - 29
	 * @param Posicion del numero primo que deseas, empezando por la posición 1.
	 * @return El numero primo de la posicion que has introducido.
	 */
	public String iesimoPrimo(int primoRequerido) {
		Scanner in = new Scanner(System.in);	
		while (primoRequerido <= 1) {
			if (primoRequerido == 1)  
				return "El numero primo " + primoRequerido + "# es: 2";
			System.out.println("ERROR: Dame el # primo requerido nuevamente");
			primoRequerido = in.nextInt();
		}
		
		int primos[] = new int[primoRequerido];
		primos[0] = 2;
		primos[1] = 3;
		int probar = 3, actual = 2;

		
		
		if (primoRequerido == 2) {
		} else {

			while (actual < primoRequerido) {
				probar = probar + 2;
				int contador = 0;

				while (probar % primos[contador] > 0 && contador < actual
						&& probar * 10 / primos[contador] > 9) {
					if (contador + 1 == actual) {
						primos[actual] = probar;
						actual = (actual + 1);			
					} else {
					}
					contador = (contador + 1);
				}
			}
		}
		return "El numero primo " + primoRequerido + "# es: " + primos[primoRequerido - 1];
	}
	
	/**
	 * Metodo que sirve para saber el porcentaje de una cantidad sobre un total.
	 * Un par de ejemplos
	 * <ul>
	 * <li>Total: 100     Num: 10   Return: 10.0%
	 * <li>Total: 100     Num: 50   Return: 50.0%
	 * </ul>
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
	 * <ul>
	 * <li>Si metemos el valor 0 nos devolvera su factorial que es 1.
	 * <li>Si metemos un numero negativo, lo transformara en numero positivo.
	 * @param num = numero que queremos sacar el factorial.
	 * @return El factorial del numero deseado.
	 */
	public String esFactorial(int num) {
		BigInteger factorial = new BigInteger("1");
		int numero=num;
		// el numero 0 al ser un producto nulo o vacio devolvera el valor 1.
		if (num==0) 
			return "El factorial es 1";
		
		else {
			if(num<0)                    
				num*=-1;
			while (num!=0) {
			 factorial= factorial.multiply(new BigInteger(Integer.toString(num)));
			 num--;
			}
		
		}return "El factorial de " + numero +" es: "+ factorial;
		
	}

}
