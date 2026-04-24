package _10_slot_machine;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

public class Slot_Machine implements ActionListener{

	JFrame frame = new JFrame();
	JLabel label1;
	JLabel label2 ;
	JLabel label0;
	JPanel panel = new JPanel();
	JButton button = new JButton("spin!");
	Random rand = new Random();
	
	public void run() {
		frame.add(panel);
		letsGoGambling();
		panel.add(label0);
		panel.add(label1);
		panel.add(label2);
		panel.add(button);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	public void letsGoGambling() {
		int ran = rand.nextInt(3);
		int ra = rand.nextInt(3);
		int r = rand.nextInt(3);
		label0 = loadImageFromComputer(ra+".png"); 
		label1 = loadImageFromComputer(ran+".png");
		label2 = loadImageFromComputer(r+".png");
		
	}
	
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == button) {
			letsGoGambling();
		}
	}
	
}
