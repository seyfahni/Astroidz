/*
 * The MIT License
 *
 * Copyright 2016 Joshua and Dano.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package joshi.astroidz.ui;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Joshua
 */
public class MainMenu {
    private JFrame frame;
    private JPanel panel;
    private JButton start;
    private JButton highscore;
    private JButton options;
    private JButton exit;

    public static void main(String[] args) {
        MainMenu mm;
        mm = new MainMenu();
        mm.mmenu();
    }

    public void mmenu() {
        frame = new JFrame("Main Menu");
        panel = new JPanel();
        start = new JButton("Start");
        highscore = new JButton("Highscore");
        options = new JButton("Options");
        exit = new JButton("Exit");
    
        panel.setLayout(new GridLayout(4,1));                                
        panel.add(start);
        start.addActionListener(new ALstart());
        panel.add(highscore);
        highscore.addActionListener(new ALhighscore());
        panel.add(options);
        options.addActionListener(new ALoptions());
        panel.add(exit);
        exit.addActionListener(new ALexit());
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.SOUTH);
        frame.addKeyListener(new MKeyListener());
        frame.setVisible(true);
    }
    
    public class ALstart implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
    public class ALhighscore implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
    public class ALoptions implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
    public class ALexit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(1);
        }
    }
    
    public class MKeyListener implements KeyListener {
        public void keyTyped(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}