import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class riddleThingy {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JTextField textFeild = new JTextField();
	JLabel label = new JLabel();
	public static void main(String[] args) {
		riddleThingy r = new riddleThingy();
		r.frame.setSize(500, 500);
		r.frame.setVisible(true);
		r.frame.add(r.button);
		r.frame.add(r.button1);
		r.frame.add(r.label);
		r.frame.add(r.textFeild);
	}
}
