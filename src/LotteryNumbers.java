import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener {
	JPanel panel = new JPanel();
	JLabel number1 = new JLabel();
	JLabel number2 = new JLabel();
	JLabel number3 = new JLabel();
	JLabel number4 = new JLabel();
	JLabel number5 = new JLabel();
	JLabel number6 = new JLabel();
	JButton button = new JButton("Quick Pick!");
	//BufferedImage image = ImageIO.read(getClass().getResource("lotteryTicket.jpg"));
	public static void main(String[] args) {
		LotteryNumbers number = new LotteryNumbers();
		number.draw();
	}

	@Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int random1 = random.nextInt(100);
		int random2 = random.nextInt(100);
		int random3 = random.nextInt(100);
		int random4 = random.nextInt(100);
		int random5 = random.nextInt(100);
		int random6 = random.nextInt(100);
		String r1 = Integer.toString(random1);
		String r2 = Integer.toString(random2);
		String r3 = Integer.toString(random3);
		String r4 = Integer.toString(random4);
		String r5 = Integer.toString(random5);
		String r6 = Integer.toString(random6);
		number1.setText(r1);
		number2.setText(r2);
		number3.setText(r3);
		number4.setText(r4);
		number5.setText(r5);
		number6.setText(r6);
		
		
	}
	void draw(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		button.addActionListener(this);
		panel.add(number1);
		panel.add(number2);
		panel.add(number3);
		panel.add(number4);
		panel.add(number5);
		panel.add(number6);
		panel.add(button);
		frame.add(panel);
	}
}
