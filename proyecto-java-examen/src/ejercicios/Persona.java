package ejercicios;

import java.util.Date;

/**
EJERCICIO 2
 *
 */public class Persona {
		
		public enum tipoDocumento {DNI, LIBRETA_CIVICA};
		tipoDocumento tipo;
		Integer nroDocumento;
		String nombre;
		String apellido;
		Date fechaNacimiento;

		


		public Persona(tipoDocumento tipo, Integer nroDocumento, String nombre, String apellido, Date fechaNacimiento) {
			super();
			this.tipo = tipo;
			this.nroDocumento = nroDocumento;
			this.nombre = nombre;
			this.apellido = apellido;
			this.fechaNacimiento = fechaNacimiento;
		}

		public Integer getNroDocumento() {
			return nroDocumento;
		}

		public void setNroDocumento(Integer nroDocumento) {
			this.nroDocumento = nroDocumento;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		} 
		}

