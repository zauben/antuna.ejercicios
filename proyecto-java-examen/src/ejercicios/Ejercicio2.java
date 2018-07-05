package ejercicios;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * A. Crear una clase Persona con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * TipoDocumento - enum (dni/libretacivica) 
 * NroDocumento - Integer
 * Nombre - String
 * Apellido - String
 * FechaNacimiento - Date
 * 
 * B. En el método main de la clase "Ejercicio2" crear una nueva instancia
 * de la clase persona y settearle valores reales con tus datos
 * 
 * 
 * C. En el método main de la clase "Ejercicio 2" imprimir los valores en 
 * consola 
 * (crear método main e imprimir valores) 
 *  
 * @author examen
 *
 */
public class Ejercicio2 {
		
	public static void main(String[] args) throws ParseException {
		
		Date nacimiento = parseDate("25-10-1993");
		Persona yo = new Persona(Persona.tipoDocumento.DNI,37450760, "Julian", "Antu�a", nacimiento);
		imprimirValores(yo);
	}
	
	 public static Date parseDate(String date) {
	     try {
	         return new SimpleDateFormat("dd-MM-yyyy").parse(date);
	     } catch (ParseException e) {
	         return null;
	     }
	  }
	
	private static void imprimirValores(Persona yo) {
		Format formatter = new SimpleDateFormat("dd-MM-yyyy");
		String nacimiento = formatter.format(yo.fechaNacimiento);
		
		System.out.println("Nombre: "+yo.nombre);
		System.out.println("Apellido: "+yo.apellido);
		System.out.println(yo.tipo.toString() + ": "+yo.nroDocumento.toString());
		System.out.println("Fecha de Nacimiento: " + nacimiento);
	}
	/**
	 * 
	 */
	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}
	}

	