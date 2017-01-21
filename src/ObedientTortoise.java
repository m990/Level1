import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		String shape = JOptionPane.showInputDialog("What shape do you want?");
		String color = JOptionPane.showInputDialog("What color do you want?");
		if (shape.equals("square")){
			if (color.equals("green")){
				Tortoise.setPenColor(Color.green);
				square();
			}
			else if (color.equals("red")){
				Tortoise.setPenColor(Color.red);
				square();
			}
			else if (color.equals("blue")){
				Tortoise.setPenColor(Color.blue);
			}
			else{
				JOptionPane.showMessageDialog(null, "I can't do that color.");
			}
		}
		else if (shape.equals("triangle")){
			if (color.equals("green")){
				Tortoise.setPenColor(Color.green);
				triangle();
			}
			else if (color.equals("red")){
				Tortoise.setPenColor(Color.red);
				triangle();
			}
			else if (color.equals("blue")){
				Tortoise.setPenColor(Color.blue);
				triangle();
			}
			else{
				JOptionPane.showMessageDialog(null, "I can't do that color.");
			}
		}
		else if (shape.equals("circle")){
			if (color.equals("green")){
				Tortoise.setPenColor(Color.green);
				circle();
			}
			else if (color.equals("red")){
				Tortoise.setPenColor(Color.red);
				circle();
			}
			else if (color.equals("blue")){
				Tortoise.setPenColor(Color.blue);
				circle();
			}
			else{
				JOptionPane.showMessageDialog(null, "I can't do that color.");
			}
		}
	}
	static void square(){
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);
		}
	}
	static void triangle(){
		Tortoise.setSpeed(10);
		for (int i = 0; i < 3; i++) {
			Tortoise.turn(120);
			Tortoise.move(100);
		}
	}
	static void circle(){
		for (int i = 0; i < 360; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
	}
}
