package ejercicios;
/**
 * Ejercicio: analizar la siguente clase y realizar las correcciones
 * necesarias para que compile  
 * @author examen
 *
 */
public class Ejercicio1 {
	
	  	int count1;
	    static int count2;  
	    
	    public Ejercicio1() {
	    	count1 = 0;
	    	count2 ++;
	    }
	    
	    public static void main(String[] args) {
	    	Ejercicio1 ejer1 = new Ejercicio1();
	    	ejer1.incrementa1();
	    	ejer1.incrementa2();
	    	ejer1.incrementa();
	    	ejer1.showResults();
	    }

	    public void incrementa1() {
	    	count1++;
	    }

	    public void incrementa2() {
	    	count2++;
	    }

	    public void incrementa() { 
	    	count1++;
	    }
	    
	    public void showResults() {
	    	System.out.println("Variable count1: " + count1);
	    	System.out.println("Variable count1: " + count2);
	    }

}
