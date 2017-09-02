import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("What is your height in inches?");
		int number = Integer.parseInt(input);
		if (number >= 48) {
			JOptionPane.showMessageDialog(null, "Please enter");
		} else {
			JOptionPane.showMessageDialog(null, "GET OUT!!!");
		}

	}
}