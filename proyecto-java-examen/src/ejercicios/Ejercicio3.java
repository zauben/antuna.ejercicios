/**
 * 
 */
package ejercicios;

import java.util.Date;

/**
 * A. Crear una clase Alumnno con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * Persona
 * Legajo - Integer
 * 
 *  
 * @author examen
 *
 */
public class Ejercicio3 {

	/**
	 * 
	 */
	public Ejercicio3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public class Alumno extends Persona{
		
		Integer legajo;

		public Alumno(tipoDocumento tipo, Integer nroDocumento, String nombre, String apellido, Date fechaNacimiento, Integer leg) {
			super(tipo, nroDocumento, nombre, apellido, fechaNacimiento);
			legajo = leg;

		}

		public Integer getLegajo() {
			return legajo;
		}

		public void setLegajo(Integer legajo) {
			this.legajo = legajo;
		}
		
		
		
		
		
		
	}

}
