import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args){
		 Robot a = new Robot ();
		 a.moveTo(0, 1000);
		 a.setSpeed(100);
		 a.penDown();
		 a.setPenWidth(10);
		 a.setPenColor(Color.pink);
		 a.move(100);
		 a.turn(45);
		 a.move(50);
		 a.turn(90);
		 a.move(50);
		 a.turn(45);
		 a.move(100);
		 a.setPenColor(Color.green);
		 a.turn(-90);
		 a.move(25);
		 a.turn(-90);
		 a.setPenColor(Color.RED);
		 a.move(250);
		 a.turn(45);
		 a.move(50);
		 a.turn(90);
		 a.move(50);
		 a.turn(45);
		 a.move(250);
		 a.penUp();
		 a.moveTo(1000, 10000);
	}
	
}
