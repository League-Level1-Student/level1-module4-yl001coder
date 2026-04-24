package _09_whack_a_mole;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;
public class Whack_A_Mole_ implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton();
	
	
	Random rand = new Random();
	int number;
	int ran = 0;
	
	public void run()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,840);
		frame.add(panel);
		frame.setVisible(true);
		drawButtons(24);
		
	}
	
	public void drawButtons(int ran) {
		int r = rand.nextInt(ran);
		for(int i = 0; i < ran; i ++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			button.setSize(100,70);
		}
		
	}

	
	public void actionPerformed(ActionEvent e)
	{
		JButton buttonPressed = (JButton) e.getSource();
					

	
	}
}
