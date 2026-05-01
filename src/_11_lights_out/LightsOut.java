package _11_lights_out;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener {

	JFrame frame = new JFrame();
	JPanel gamePanel = new JPanel();
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23,label24,label25 = new JLabel();
	
//labels! :D
	public void run() {
		
		/** PART 1. CREATE YOUR LIGHT BOARD **/
		//1. Make your gamePanel a 5x5 grid with setLayout(new GridLayout(5, 5));
		gamePanel.setLayout(new GridLayout(5,5));
		
		for(int i = 0; i < 25; i ++) {
			JLabel light = new JLabel();
			light.setText(String.valueOf(i));
			light.setBackground(Color.LIGHT_GRAY);
			light.addMouseListener(this);
			gamePanel.add(light);
			light.setOpaque(true);
			
		}
		frame.pack();
		
			//2. Add 25 JLabels to your gamePanel (these are your lights)

	
//			3. Use setText() to add a position number to each light (0-24)//.

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.add(gamePanel);
		
//			//4. Set the background of each light to LIGHT_GRAY
//			// - you will also have to set the background to opaque.
//			// - Use light.setOpaque(true);
//
//			//5. Add a mouseListener to each light
//		
//		
//		//6. Add your panel to a frame
//		murpdeur
//
//		//7. Set the size of the frame

		frame.setVisible(true);
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
		JLabel labelClicked = (JLabel) e.getSource();
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`

		// 2. Get the number (position) of the light

		// 3. Now use the makeMove method to code which lights turn on and off.

		// 4.Check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color

		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?

	}

	void makeMove(int pos) {
		toggle((JLabel) gamePanel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) gamePanel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) gamePanel.getComponent(pos + 5));
		}
	}

	JLabel getLightAtPosition(int lightPosition) {
		return (JLabel) gamePanel.getComponent(lightPosition);
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.LIGHT_GRAY);

		} else {
			label.setBackground(Color.WHITE);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
}
