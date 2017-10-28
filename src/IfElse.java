import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {

		String varible = "yes";
		if (varible.equals("yes")) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}
		System.out.println("Wednesday");
		int age = 29;
		if (age < 20) {
			System.out.println("it's so great being young!!!!");
		} else {
			System.out.println("Don't you wish you were young. :(");
		}
		String animal = JOptionPane.showInputDialog("What is your favorite animal?");
		if (animal.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Dogs go woof");

		} else if (animal.equals("cat")) {
			JOptionPane.showMessageDialog(null, "Cats go meow");

		} else {
			JOptionPane.showMessageDialog(null, "I don't know that animal.");
		}

	}
}
