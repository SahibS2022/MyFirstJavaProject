package methodLearning;

public class OperationsMain {

	public static void main(String[] args) {

		//instantiating the MathematicalOperations class
		MathematicalOperations mo = new MathematicalOperations();
		mo.addition();//invoking the adding method using mo which is reference of the MathematicalOperations Class
		mo.multiplication();
		mo.subtraction();
		mo.division();

	}

}
