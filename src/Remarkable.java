import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please input a coding teacher's name");
		if (name.equals("Roberto")) {
			JOptionPane.showMessageDialog(null, "He is remarkably smart.");
		} else if (name.equals("Christopher")) {
			JOptionPane.showMessageDialog(null, "He is remarkably cool.");
		} else if (name.equals("Keith")) {
			JOptionPane.showMessageDialog(null, "He is remarkable at coding");
		} else if (name.equals("Maria")) {
			JOptionPane.showMessageDialog(null, "She is remarkably stylish.");
		} else if (name.equals("Anurup")) {
			JOptionPane.showMessageDialog(null, "He is remarkably helpful.");
		}

	}
}