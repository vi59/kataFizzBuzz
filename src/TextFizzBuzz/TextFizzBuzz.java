package TextFizzBuzz;

import org.junit.Before;
import org.junit.Test;

import FizzBuzz.FizzBuzz;

public class TextFizzBuzz {

	private FizzBuzz fb;

	@Before
	public void setUp() throws Exception{
		fb = new FizzBuzz();
	}
	
	@Test
	public void canEvaluate(){
		FizzBuzz fb = new FizzBuzz();
		fb.evaluate(1);
	}

	/*@Test
	public void oneReturnOne() {
		String result = fb.evaluate(1);
		asserEquals("1",result);   
	}*/

}



