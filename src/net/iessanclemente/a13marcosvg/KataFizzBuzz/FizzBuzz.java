package net.iessanclemente.a13marcosvg.KataFizzBuzz;

public class FizzBuzz {
	/**
	 * Metodo evaluate() que convierte un numero entero en una cadena 
	 * @param number
	 * @return devuelve el numero convertido a cadena
	 */
	public String evaluate(int number){
		if(isMultipleOf3(number) && isMultipleOf5(number))// si el parametro es multiplo de 3 y multiplo de 5 devolverá FizzBuzz
		{
			return "FizzBuzz";
		}
		else if (isMultipleOf3(number) || Integer.toString(number).contains("3")) // si el parametro es multiplo de 3 devolverá Fizz o contiene un 3 devolverá Fizz
		{
			return "Fizz";
		}
		else if (isMultipleOf5(number) || Integer.toString(number).contains("5")) // si el parametro es multiplo de 5 o contiene un 5 devolverá Buzz
		{
			return "Buzz";
		}
		return String.valueOf(number);
	}

	/**
	 * Metodo que comprueba si un numero es divisible por 5
	 * @param number numero introducido como parametro
	 * @return devuelve true si es divisible por 5 si no false
	 */
		
	private boolean isMultipleOf5(int number) {
		return number %5 == 0;
	}
	
	/**
	 * Metodo que comprueba si un numero es divisible por 3
	 * @param number numero introducido como parametro
	 * @return devuelve true si es divisible por 3 si no false
	 */
	private boolean isMultipleOf3(int number) {
		return number %3 == 0;
	}
}
