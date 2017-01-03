import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class houses {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		Tortoise.setX(10);
		Tortoise.setY(430);
		drawHouse("small");
		drawHouse("medium");
		drawHouse("large");
		drawHouse("small");
		drawHouse("large");
		drawHouse("medium");
		drawHouse("small");
	}
	
	static void drawHouse(String size){
		if (size.equals("small")){
			Tortoise.move(60);
			pointedRoof("small");
			Tortoise.setPenColor(Color.GREEN);
			Tortoise.turn(-90);
			Tortoise.move(25);
			Tortoise.turn(270);
			Tortoise.setPenColor(Color.black);
		}
		else if (size.equals("medium")){
			Tortoise.move(120);
			pointedRoof("medium");
			Tortoise.setPenColor(Color.GREEN);
			Tortoise.move(60);
			Tortoise.turn(-90);
			Tortoise.move(120);
			Tortoise.turn(270);
			Tortoise.setPenColor(Color.black);
		}
		else if  (size.equals("large")){
			Tortoise.move(250);
			pointedRoof("large");
			Tortoise.setPenColor(Color.GREEN);
			Tortoise.turn(-90);
			Tortoise.move(25);
			Tortoise.turn(270);
			Tortoise.setPenColor(Color.black);
		}
	}
	static void pointedRoof(String size){
		if (size.equals("large")){
			Tortoise.turn(45);
			Tortoise.move(120);
			Tortoise.turn(90);
			Tortoise.move(120);
			Tortoise.turn(45);
			Tortoise.move(250);
		}
		else if (size.equals("medium")){
			Tortoise.turn(45);
			Tortoise.move(60);
			Tortoise.turn(90);
			Tortoise.move(60);
			Tortoise.turn(45);
			Tortoise.move(60);
		}
		else if (size.equals("small")){
			Tortoise.turn(45);
			Tortoise.move(60);
			Tortoise.turn(90);
			Tortoise.move(60);
			Tortoise.turn(45);
			Tortoise.move(60);
		}
	}
}