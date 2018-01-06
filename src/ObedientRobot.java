import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		String s=JOptionPane.showInputDialog("What shape do you want? square triangle or circle");
		Robot a = new Robot();
		a.setSpeed(10);
		a.move(50);
		a.penDown();
		a.turn(90);
		a.move(50);
		a.turn(90);
		a.move(100);
		a.turn(90);
		a.move(100);
		a.turn(90);
		a.move(100);
		a.turn(90);
		a.move(50);
		a.penUp();
		a.turn(-90);
		a.move(1000);
		}
	}


