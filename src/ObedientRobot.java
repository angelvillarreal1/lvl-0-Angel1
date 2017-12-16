import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		Robot a = new Robot();
		a.penDown();
		a.setSpeed(10);
		a.move(50);
		a.turn(90);
		a.move(50);
		a.turn(90);
		a.move(100);
		a.turn(90);
		a.move(100);
		a.turn(90);
		a.move(100);
	}
}
