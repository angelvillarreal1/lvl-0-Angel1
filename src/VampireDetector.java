import javax.swing.JOptionPane;

public class VampireDetector {
	public static void main(String[] args) {

		String shortcut = " Input yes or no, don't input something else.";

		String bat = JOptionPane.showInputDialog("Can you turn into a bat?" + shortcut);
		String night = JOptionPane.showInputDialog("Are you nocturnal?" + shortcut);
		String blood = JOptionPane.showInputDialog("Do you like blood?" + shortcut);

		if (bat.equals("yes") && night.equals("yes") && blood.equals("yes")) {
			JOptionPane.showMessageDialog(null, "VAMPIRE!!!!!!!");
		} else if (bat.equals("no") && night.equals("yes") && blood.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You're a cannibal, aren't you?");
		} else if (bat.equals("yes") && night.equals("yes") && blood.equals("no")) {
			JOptionPane.showMessageDialog(null, "Normal bat!");
		} else if (bat.equals("yes") && night.equals("no") && blood.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Vampire Bat!!!");
		} else if (bat.equals("no") && night.equals("yes") && blood.equals("no")) {
			JOptionPane.showMessageDialog(null, "You're a night person.");
		} else if (bat.equals("no") && night.equals("no") && blood.equals("no")) {
			JOptionPane.showMessageDialog(null, "Hi, normal person");
		} else {
			JOptionPane.showMessageDialog(null, "You're probably a normal person");
		}
	}
}