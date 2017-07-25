import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.prism.paint.Color;

public class BeatBox {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	public static void main(String[] args) {
		BeatBox bb = new BeatBox();
		bb.frame.setSize(500, 500);
		bb.frame.add(bb.button1);
		bb.button1.setBackground(java.awt.Color.BLACK);
		bb.frame.add(bb.button2);
		bb.frame.add(bb.button3);
		bb.button3.setBackground(java.awt.Color.BLACK);
	}
	void speak(String words){
		try{
			Runtime.getRuntime().exec("say " + words);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
