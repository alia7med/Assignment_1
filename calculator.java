package calculator;

public class calculator implements  ICalculator {

	@Override
	public int add(int x, int y) {
			if(y==0)
				throw new ArithmeticException("Error ,Division by zero.");
		return x+y;
	}

	@Override
	public float divide(int x, int y) {
		 			
		return 	(float)x/y;
	}
	
}
