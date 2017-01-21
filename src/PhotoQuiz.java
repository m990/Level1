 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String url = "http://static4.businessinsider.com/image/56c640526e97c625048b822a-480/donald-trump.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(url);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("Is that a fake smile?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("yes")){
			JOptionPane.showMessageDialog(null, "Correct!!!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else if (answer.equals("no")){
			JOptionPane.showMessageDialog(null, "Incorrect...");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
		String url2 = "http://i2.cdn.turner.com/money/dam/assets/160928162934-alec-baldwin-donald-trump-780x439.jpg";
		Component image2;
		image2 = createImage(url2);
		// 11. add the second image to the quiz window
		quizWindow.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("Is that he real Donald Trump?");
		if (answer2.equals("yes")){
			JOptionPane.showMessageDialog(null, "NO");
		}
		else if (answer2.equals("no")){
			JOptionPane.showMessageDialog(null, "Correct!?");
		}
		// 14+ check answer, say if correct or incorrect, etc.
		
		quizWindow.remove(image2);
		
		String url3 = "http://media.vanityfair.com/photos/5859953996dcf8e473affe0f/master/pass/donald-trump-alec-baldwin-snl.jpg";
		
		Component image3;
		image3 = createImage(url3);
		
		image3.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
			
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
					System.out.println("The mouse has moved!?");
			}
		});
		
		quizWindow.add(image3);
		quizWindow.pack();
		
		String answer3 = JOptionPane.showInputDialog("Are these two friends in real life?");
		if (answer3.equals("yes")){
			JOptionPane.showMessageDialog(null, "It looks that way.");
		}
		else if (answer3.equals("no")){
			JOptionPane.showMessageDialog(null, "A very famous man named Donald Trump would say, 'Wrong!'");
		}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}