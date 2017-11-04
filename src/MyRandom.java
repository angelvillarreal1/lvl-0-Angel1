import java.util.Random;

public class MyRandom {
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(1000);
		System.out.println(number);
		Random life = new Random();
		int notlife = life.nextInt(900);
		System.out.println(notlife);
		System.out.println(number+notlife);
		System.out.println(number-notlife);
	}
}
