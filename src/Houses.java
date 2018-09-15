import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	 static Robot a = new Robot ();
	public static void main(String[] args){
		 a.setWindowSize(1600, 900);
		 a.setWindowColor(Color.black);
		 a.moveTo(0, 900);
		 a.setSpeed(100);
		 a.penDown();
		 a.setPenWidth(10);
		for(int i = 1;i <= 10;i++) {
		System.out.println(i);	
		makeHouse("small" , Color.BLUE);
		}		 		
	}
	public static  void makeHouse(String height, Color wagn) {
		if(height.equalsIgnoreCase("small")) {
		a.setPenColor(wagn);
		 a.move(60);
		 drawPointyRoof();
		 a.move(60);
		 a.setPenColor(Color.green);
		 a.turn(-90);
		 a.move(25);
		 a.turn(-90);
		}
		else if(height.equalsIgnoreCase("medium")) {
			a.setPenColor(wagn);
			 a.move(120);
			 a.turn(90);
			 a.move(50);
			 a.turn(90);
			 a.move(120);
			 a.setPenColor(Color.green);
			 a.turn(-90);
			 a.move(25);
			 a.turn(-90);
			}
		else if(height.equalsIgnoreCase("large")) {
			a.setPenColor(wagn);
			 a.move(250);
			 drawFlatRoof();
			 a.move(250);
			 a.setPenColor(Color.green);
			 a.turn(-90);
			 a.move(25);
			 a.turn(-90);
			}
	}
	public static void drawFlatRoof() {
		a.turn(90);
		 a.move(50);
		 a.turn(90);
	}
	public static void drawPointyRoof() {
		a.turn(45);
		 a.move(25);
		 a.turn(90);
		 a.move(25);
		 a.turn(45);
	}
}
/* 

9. Make large houses have flat roofs 
*/