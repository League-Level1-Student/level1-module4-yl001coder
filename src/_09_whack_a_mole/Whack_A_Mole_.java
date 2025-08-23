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
	JButton button0 = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	Random rand = new Random();
	int number;
	int ran = 0;
	public void run(int number)
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button0);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		frame.setSize(275,150);
		button0.setSize(100,70);
		button1.setSize(100,70);
		button2.setSize(100,70);
		button3.setSize(100,70);
		button4.setSize(100,70);
		button5.setSize(100,70);
		button6.setSize(100,70);
		button7.setSize(100,70);
		button8.setSize(100,70);
		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==button0)
		{
			button0.setText("meow ;)");
			button0.setText("");
		}
		if(buttonPressed==button1)
		{
			button1.setText("meow ;)");

		}
		if(buttonPressed==button2)
		{
			button2.setText("meow ;)");
			
		}
		if(buttonPressed==button3)
		{
			button3.setText("meow ;)");

		}
		if(buttonPressed==button5)
		{
			button5.setText("meow ;)");
			button5.setText("");
		}
		if(buttonPressed==button6)
		{
			button6.setText("meow ;)");
			
		}
		if(buttonPressed==button7)
		{
			button7.setText("meow ;)");
			
		}
	
	}
}
