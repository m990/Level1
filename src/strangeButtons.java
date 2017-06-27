import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class strangeButtons implements ActionListener {
	JButton gold = new JButton();
	JButton silver = new JButton();
	JButton bronze = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		strangeButtons jeff = new strangeButtons();
		jeff.frame.setVisible(true);
		jeff.frame.setSize(500, 200);
		jeff.panel.add(jeff.gold);
		jeff.panel.add(jeff.silver);
		jeff.panel.add(jeff.bronze);
		jeff.gold.setText("guld");
		jeff.silver.setText("silfr");
		jeff.bronze.setText("brunz");
		jeff.bronze.setBackground(Color.YELLOW);
		jeff.silver.setBackground(Color.LIGHT_GRAY);
		jeff.gold.setBackground(Color.ORANGE);
		jeff.gold.setOpaque(true);
		jeff.bronze.setOpaque(true);
		jeff.silver.setOpaque(true);
		jeff.frame.add(jeff.panel);
		jeff.frame.pack();
		jeff.gold.addActionListener(jeff);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		speak("guld");
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
