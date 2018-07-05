package ejercicios;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Ejercicio4 {

	// listas de ejemplo, pueden variarse su contenido,
	 static Integer[] valoresLista1 = {1, 2, 5, 8, 10, 30, 20, 8, 9, 10};
	 static Integer[] valoresLista2 = {1, 2, 4, 20, 5, 10, 7, 8, 10, 9};

	/**
	 * Para ejecutar el método main se debe hacer boton derecho sobre la clase "Run
	 * As --> Java Application"
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("**** inicializando datos ****");

		List<Integer> lista1 = new ArrayList<Integer>(Arrays.asList(valoresLista1));
		List<Integer> lista2 = new ArrayList<Integer>(Arrays.asList(valoresLista2));

		System.out.println("**** inicializacion exitosa ****");

		// EJERCICIO 4.1: explicar salidas y sugerir mejoras
		informacion(lista1, 10);

		// EJERCICIO 4.2: corregir el metodo
		List<Integer> union = unionListas(lista1, lista2);
		System.out.println("union: " + union.toString());

		// EJERCICIO 4.3: implementar
		List<Integer> interseccion = interseccionListas(lista1, lista2);
		System.out.println("interseccion: " + interseccion.toString());

		// EJERCICIO 4.4: implementar
		List<Integer> orden1 = ordenaListaAscendente(lista1);
		System.out.println("orden asc: " + orden1);

		// EJERCICIO 4.5: implementar
		List<Integer> orden2 = ordenaListaDescendente(lista2);
		System.out.println("orden desc: " + orden2);

		// EJERCICIO 4.6: implementar
		boolean b = tienenMismoContenido(lista1, lista2);
		System.out.println("mismo contenido: " + b);

	}

	private static void informacion(List<Integer> lista1, Integer numero) {
		// TODO: explicar salidas de los system out y sugerir alguna mejora a la
		// implementacion

		int pares = 0;
		for (Integer n : lista1) {
			if (n % 2 == 0) {
				pares = pares + 1;
				// pares++; (posible sugerencia de implementacion)
			}
		}

		System.out.println("A continacion se muestra cuantos metodos de la lista son pares");
		System.out.println("... " + pares);

		List<Integer> impares = new ArrayList<Integer>();
		for (Integer n : lista1) {
			if (n % 2 != 0) {
				impares.add(n);
			}
		}

		System.out.println("A continacion se muestra la lista de todos los elementos impares");
		System.out.println("... " + impares.toString());

		int p = lista1.size() / 2;
		System.out.println(
				"A continacion se muestra el indice donde se encuentra guardado el primer elemento que tenga el mismo valor numerico que el tama�o de la lista dividido 2 (En este caso es el valor 5, por eso el indice 2)");
		System.out.println("..." + lista1.indexOf(p));

		int c = 0;
		for (Integer n : lista1) {
			if (n > numero) {
				c = c + 1;
				// c++;(sugerido)
			}
		}
		// c = cantidad de elementos de la lista mayores a "numero"
		if (c > lista1.size() / 2) {
			System.out.println("Mas del 50% de los elementos de la lista son mayores a " + numero.toString());
		} else if (c > 0) {
			System.out.println("Hay entre 1 y 5 elementos en la lista mayores a " + numero.toString());
		} else {
			System.out.println("Ningun elemento de la lista es mayor a " + numero.toString());
		}

		// sugerencia
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 *            retornar una lista que contenga los elementos de ambas listas, sin
	 *            elementos repetidos
	 * 
	 */

	private static List<Integer> unionListas(List<Integer> lista1, List<Integer> lista2) {
		// TODO: corregir el metodo para que funcione correctamente

		// List<Integer> union = null;
		HashSet<Integer> union = new HashSet<Integer>();

		union.addAll(lista1);
		union.addAll(lista2);

		/*
		 * for (Integer m: lista2) { if (!union.contains(m)) { union.add(m); } }
		 */

		return new ArrayList<Integer>(union);
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 *            retornar una lista que contenga los elementos que estan presentes
	 *            en ambas listas, sin elementos repetidos
	 * 
	 */
	private static List<Integer> interseccionListas(List<Integer> lista1, List<Integer> lista2) {
		// TODO:

		lista1.retainAll(lista2);
		HashSet<Integer> union = new HashSet<Integer>(lista1);

		return new ArrayList<Integer>(union);
	}

	/***
	 * @param lista1
	 * 
	 *            retornar la lista recibida, ordenada en forma ascendente
	 * 
	 */
	private static List<Integer> ordenaListaAscendente(List<Integer> lista1) {
		// TODO:

		Collections.sort(lista1);

		return new ArrayList<Integer>(lista1);
	}

	/***
	 * @param lista2
	 * 
	 *            retornar la lista recibida, ordenada en forma descendente
	 * 
	 */
	private static List<Integer> ordenaListaDescendente(List<Integer> lista2) {
		// TODO:
		Comparator<Integer> comp = Collections.reverseOrder();
		Collections.sort(lista2, comp);

		return new ArrayList<Integer>(lista2);
	}

	/***
	 * @param lista1
	 * @param lista2
	 * 
	 *            devuelve true si contienen los mismos elementos NO se considera
	 *            valido que esten en diferente orden NO se considera valido que la
	 *            cantidad de repeticiones de los elementos sea diferente
	 * 
	 */
	private static boolean tienenMismoContenido(List<Integer> lista1, List<Integer> lista2) {
		// TODO: comparacion de lista sensible a orden y repeticiones


		return lista1.equals(lista2);
		

	}

}
