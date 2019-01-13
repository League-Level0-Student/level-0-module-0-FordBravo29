package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot mobi = new Robot();
		mobi.setSpeed(2000);
		mobi.penDown();
		mobi.move(150);
		mobi.turn(90);
		mobi.move(87);
		mobi.turn(180);
		mobi.move(87);
		mobi.turn(90);
		mobi.move(120);
		mobi.turn(90);
		mobi.move(100);
		mobi.hide();
	}
}
