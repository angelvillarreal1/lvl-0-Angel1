import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("What shape do you want? square triangle or circle");
		if (s.equals("square")) {
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
		else if (s.equals("triangle")) {
			Robot a = new Robot();
			a.setSpeed(10);
			a.turn(180);
			a.move(50);
			a.penDown();
			a.turn(90);
			a.move(50);
			a.turn(120);
			a.move(100);
			a.turn(120);
			a.move(100);
			a.turn(120);
			a.move(50);
			a.penUp();
			a.turn(90);
			a.move(1000);
		}
		else if(s.equals("circle")) {
			Robot a = new Robot();
			a.setSpeed(10000);
			a.move(100);
			a.turn(90);
			a.penDown();
			for (int i = 1; i <=358 ; i++) {
				a.turn(1);
				a.move(1);
			  }
			a.penUp();
			a.move(1000);
			
			
		}

	}
}
