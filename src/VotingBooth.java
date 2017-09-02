import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("What is your age?");
		int number = Integer.parseInt(input);
		if (number >= 18) {
			JOptionPane.showInputDialog("Who do you think should be next president?");
		} else {
			JOptionPane.showMessageDialog(null, "GET OUT!!!");
		}

	}
}
