import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What is your favorite color");
		JOptionPane.showMessageDialog(null, color + " is also my favorite color");
		Robot bbate = new Robot();
		bbate.penDown();
		bbate.setSpeed(10);
		bbate.move(200);
		bbate.turn(120);
		bbate.move(200);
		bbate.turn(120);
		bbate.move(200);
		bbate.turn(120);
	}
}
