import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

JButton joke;


public class CluckleClicker implements ActionListener {
	public static void main(String[] args) {
		CluckleClicker max = new CluckleClicker();
		max.makeButtons();
	}
	void makeButtons(){
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton joke = new JButton();
		JButton punchLine = new JButton();
		panel.add(joke);
		panel.add(punchLine);
		joke.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Hello, you pressed the button!");
		
	}
}
