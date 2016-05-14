package net.iessanclemente.a13marcosvg.TextFizzBuzz;


import static org.junit.Assert.assertEquals;

import net.iessanclemente.a13marcosvg.KataFizzBuzz.FizzBuzz;

import org.junit.Before;
import org.junit.Test;

public class TextFizzBuzz {

	private FizzBuzz fb;

	/**
	 *Inicializa el metodo setUp necesario para todas la pruebas de los metodos de los tests
	 *Si no habria que instanciar esta parte en cada uno de los métodos para probarlo (ver canEvaluate)
	 */
	@Before
	public void setUp() throws Exception{
		fb = new FizzBuzz();
	}
	
	/**
	 * Metodo que comprueba que el numero introducido es un numero y lo covierte en cadena 
	 */
	@Test
	public void canEvaluate(){
		//FizzBuzz fb = new FizzBuzz();
		fb.evaluate(1);
	}

	/**
	 * Metodo que al pasarle el numero 1 el resultado es un string del numero convertido a cadena 
	 */
	@Test
	public void oneReturnOne() {
		assertEquals("1",fb.evaluate(1));   
	}
	
	@Test
	public void twoReturnTwo() {
		assertEquals("2",fb.evaluate(2));   
	}

	/**
	 *Metodo que comprueba  si al pasar un numero es múltiplo de 3 y devuelve Fizz
	 */
	
	@Test
	public void threeReturnsFizz(){
		assertEquals("Fizz",fb.evaluate(3));
	}
	
	/**
	 *Metodo que comprueba si al pasar un numero es múltiplo de 5 y devuelve Buzz 
	 */
	
	@Test
	public void fiveReturnsBuzz(){
		assertEquals("Buzz",fb.evaluate(5));
	}
	
	// Realizo dos tests más para comprobar si 6 y 10 son multiplos de 3 y 5 respectivamente
	@Test
	public void sixReturnsFizz(){
		assertEquals("Fizz",fb.evaluate(6));
	}
	
	@Test
	public void tenReturnsBuzz(){
		assertEquals("Buzz",fb.evaluate(10));
	}
	
	/**
	 *Metodo que comprueba si al pasar un numero es múltiplo de de 3 y 5 
	 */
	@Test
	public void fifteenReturnsFizzBuzz(){
		assertEquals("FizzBuzz",fb.evaluate(15));
	}
	
	// Realizo un test más para comprobar si 30 es divisible por 3 y 5
	@Test
	public void thirthyReturnsFizzBuzz(){
		assertEquals("FizzBuzz",fb.evaluate(30));
	}
	
	//Esto vai para a rama BuzzSiCinco e non se vai ver nin en master nin en FizzSi3
	
	/**
	 * Compruebo con un numero que no es multiplo de 3 o de 5 o de ambos para que devuelva Buzz si contiene un 5 o un Fizz si contiene 3
	 */  
	@Test
	public void fiftyThreeBuzz(){
		assertEquals("Buzz",fb.evaluate(52));
	}
	@Test
	public void thirtyOneFizz(){
		assertEquals("Fizz",fb.evaluate(31));
	}
	

}



