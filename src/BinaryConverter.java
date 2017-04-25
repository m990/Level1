import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.javafx.scene.layout.region.Margins.Converter;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textField = new JTextField(20);
	JButton convertButton = new JButton();
	JTextField label = new JTextField(20);
	public static void main(String[] args) {
		BinaryConverter converter = new BinaryConverter();
		converter.convertButton.setText("Convert");
		converter.convertButton.addActionListener(converter);
		converter.frame.setSize(400, 200);
		converter.frame.setVisible(true);
		converter.panel.add(converter.textField);
		converter.panel.add(converter.convertButton);
		converter.panel.add(converter.label);
		converter.frame.add(converter.panel);
	}
	 String convertString(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String result = convertString(textField.getText());
		label.setText(result);
	}
}
//3martyats nerds4uœ