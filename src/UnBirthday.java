import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("When is your birthday");
		if (birthday.equals("August 26")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday!!");
		}
	}
}
