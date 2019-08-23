package j12.simple.gui;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{
	JButton button;
	JFrame frame;
	boolean flag = true;

	public static void main(String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		button = new JButton("Button Off!");
		button.setForeground(Color.RED);

		button.addActionListener(this);

		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}


	public void actionPerformed(ActionEvent event) {
		if(this.flag) {
			button.setText("Button On!");
			button.setForeground(Color.GREEN);
			this.flag = false;
		}else {
			button.setText("Button Off!");
			button.setForeground(Color.RED);
			this.flag = true;
		}
	}

}
