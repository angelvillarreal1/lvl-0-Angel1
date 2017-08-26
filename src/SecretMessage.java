import javax.swing.JOptionPane;

public class SecretMessage {
	public static void main(String[] args) {
		String pass= JOptionPane.showInputDialog("I am thinking of a numder between 1 - 500. What is my number?");
		if (pass.equals("64")) {
			JOptionPane.showMessageDialog(null, "The secret message is (Was this hard?).");
		} else {
			JOptionPane.showMessageDialog(null, "Intruder!!!");
		}
		
		
		
		
		
		
	}
}
