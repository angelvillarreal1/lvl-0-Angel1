import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("What shape do you want? square triangle or circle");
		if (s.equals("square")) {
			String c = JOptionPane.showInputDialog("What color do you want. green, blue, or red");
			if (c.equals("red")) {
				Robot a = new Robot();
				a.setSpeed(10);
				a.move(50);
				a.setPenColor(255, 0, 0);
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
			} else if (c.equals("blue")) {
				Robot a = new Robot();
				a.setSpeed(10);
				a.move(50);
				a.setPenColor(0, 0, 255);
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
			} else if (c.equals("green")) {
				Robot a = new Robot();
				a.setSpeed(10);
				a.move(50);
				a.penDown();
				a.setPenColor(0, 255, 0);
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
		} else if (s.equals("triangle")) {
			String c = JOptionPane.showInputDialog("What color do you want. green, blue, or red");
			if (c.equals("red")) {
				Robot a = new Robot();
				a.setSpeed(10);
				a.turn(180);
				a.move(50);
				a.setPenColor(255, 0, 0);
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
			} else if (c.equals("blue")) {
				Robot a = new Robot();
				a.setSpeed(10);
				a.turn(180);
				a.move(50);
				a.setPenColor(0, 0, 255);
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
			} else if (c.equals("green")) {
				Robot a = new Robot();
				a.setSpeed(10);
				a.turn(180);
				a.move(50);
				a.setPenColor(0, 255, 0);
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
		} else if (s.equals("circle")) {
			String c = JOptionPane.showInputDialog("What color do you want. green, blue, or red");
			if (c.equals("red")) {
				Robot a = new Robot();
				a.setSpeed(10000);
				a.move(100);
				a.turn(90);
				a.setPenColor(255, 0, 0);
				a.penDown();
				for (int i = 1; i <= 358; i++) {
					a.turn(1);
					a.move(1);
				}
				a.penUp();
				a.move(1000);

			} else if (c.equals("blue")) {
				Robot a = new Robot();
				a.setSpeed(10000);
				a.move(100);
				a.turn(90);
				a.setPenColor(0, 0, 255);
				a.penDown();
				for (int i = 1; i <= 358; i++) {
					a.turn(1);
					a.move(1);
				}
				a.penUp();
				a.move(1000);

			} else if (c.equals("green")) {
				Robot a = new Robot();
				a.setSpeed(10000);
				a.move(100);
				a.turn(90);
				a.setPenColor(0, 255, 0);
				a.penDown();
				for (int i = 1; i <= 358; i++) {
					a.turn(1);
					a.move(1);
				}
				a.penUp();
				a.move(1000);

			}
		}
	}
}
