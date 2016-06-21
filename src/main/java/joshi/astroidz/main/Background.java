/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joshi.astroidz.main;

/**
 *
 * @author Dano & Joshua
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Background {

	JFrame frame = new JFrame();
	ZeichenPanel m = new ZeichenPanel();
	Image[] imageArray = new Image[1];

	public static void main(String[] args) {

		Background b = new Background();
		b.los();
	} // end of main

	public void los() {
		JFrame frame = new JFrame("Animation");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m = new ZeichenPanel();
		frame.add(m);

		imageArray[0] = new ImageIcon("background1.jpg").getImage();
                
                frame.setSize(600,700);
                frame.setVisible(true);
	}

	class ZeichenPanel extends JPanel {
		private static final long serialVersionUID = -2949720020476023L;

			@Override
		public void paintComponent(Graphics g) {
			g.drawImage(imageArray[0], 2, 2, this);
		}
	}
}
