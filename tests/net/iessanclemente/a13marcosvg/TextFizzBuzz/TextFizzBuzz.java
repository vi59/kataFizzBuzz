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

}



