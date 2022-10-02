
public class WhileLoop {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 100) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("The number " + i + "is divisbile by 3 and 5 only from range 1 to 100");
			}
			i++;
		}
	}

}
