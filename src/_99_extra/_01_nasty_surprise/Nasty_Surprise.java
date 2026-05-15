package _99_extra._01_nasty_surprise;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nasty_Surprise implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel imageLabel;
	JButton trick = new JButton("trick");
	JButton treat = new JButton("treat");
	
	public void run() {
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		trick.addActionListener(this);
		treat.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == treat) {
			showPictureFromTheInternet("https://i.pinimg.com/1200x/da/85/1e/da851ec7973ed7753f9734da424812c0.jpg");
		}
		else if(buttonPressed == trick) {
			showPictureFromTheInternet("https://static.wikia.nocookie.net/hazbin-hotel-journey-of-the-sinners/images/7/75/Verosika_Mayday_1.webp/revision/latest?cb=20250909124043");
		}
	}
}
