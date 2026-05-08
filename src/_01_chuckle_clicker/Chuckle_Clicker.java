package _01_chuckle_clicker;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Chuckle_Clicker implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton("joke");
	JButton punchline = new JButton("punchline");
	
	
	public void run() {
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.add(panel);
		panel.add(joke);
		panel.add(punchline);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		if(button == joke) {
			JOptionPane.showMessageDialog(panel, "Instead of me, he promotes CHARLES LEE. Makes him second in command,");
		}
		else if(button == punchline) {
			JOptionPane.showMessageDialog(panel, "I'm a general, WEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
		}
		
	}
	
	
}
