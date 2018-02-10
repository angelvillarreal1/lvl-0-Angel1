
public class FibonacciNumbers {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = a + b;
		System.out.print(a+", ");
		System.out.print(b+", ");
		for (int i = 0; i <= 10; i++) {
			System.out.print(c);
			if(i < 10) {
				System.out.print(", ");
			}
			a = b;
			b = c;
			c = a + b;	
		}
	}
	
}
