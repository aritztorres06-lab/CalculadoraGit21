package calculadora21;


/**
 * * @author Aritz
 */
public class Calculadora21 {
	/**
     * Suma dos números enteros.
     */
	public int sumar(int a, int b) { 
		return a + b; 
	} 
	
	/**
     * Resta dos números enteros.
     */
	public int restar(int a, int b) { 
		 return a - b; 
	}
	
	/**
     * Multiplica dos números enteros.
     */
	public int multiplicar(int a, int b) { 
		 return a * b; 
	} 
	
	/**
     * Divide dos números enteros.
     */
	public double dividir(int a, int b) { 
		 if (b == 0) { 
			 throw new IllegalArgumentException("No se puede dividir entre cero");  } 
		 return (double) a / b; 
	}
	
	/**
     * Calcula la potencia de una base elevada a un exponente.
     */
	public int potencia(int base, int exponente) { 
		 int resultado = 1; 
		 for (int i = 0; i < exponente; i++) { 
			 resultado *= base; 
		 } 
		 return resultado; 
	} 
	
	/**
     * Calcula el resto de la división entre dos números.
     */
	public int modulo(int a, int b) { 
		 return a % b; 
	} 
}
