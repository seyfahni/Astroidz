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

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * The main menu display.
 */
public class Menu {
    private final JFrame frame;
    private final JPanel panel;
    private final JPanel mpanel;
    private final JPanel opanel;
    private final JPanel hpanel;
    private final JButton start;
    private final JButton highscore;
    private final JButton options;
    private final JButton exit;

    /**
     * Create the main menu.
     */
    public Menu() {
        this.frame = new JFrame("Main Menu");
        this.mpanel = new JPanel();
        this.opanel = new JPanel();
        this.hpanel = new JPanel();
        this.start = new JButton("Start");
        this.highscore = new JButton("Highscore");
        this.options = new JButton("Options");
        this.exit = new JButton("Exit");
    
        this.mpanel.setLayout(new GridLayout(4, 1));                                
        this.mpanel.add(this.start);
        this.start.addActionListener(new ALstart());
        this.mpanel.add(this.highscore);
        this.highscore.addActionListener(new ALhighscore());
        this.mpanel.add(this.options);
        this.options.addActionListener(new ALoptions());
        this.mpanel.add(this.exit);
        this.exit.addActionListener(new ALexit());
        
        this.panel = new JPanel(new CardLayout());
        this.panel.add(this.mpanel, BorderLayout.SOUTH);
        this.panel.add(this.opanel, "options");
        this.panel.add(this.hpanel, "highscore");
        
        this.frame.setSize(800, 600);
        this.frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.frame.add(this.panel);
        this.frame.addKeyListener(new MKeyListener());
        this.frame.setVisible(true);
    }
    
    /**
     * A main method to test the main menu.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Menu m = new Menu();
    }

    class ALstart implements ActionListener {

        ALstart() { }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
    class ALhighscore implements ActionListener {

        ALhighscore() { }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
    class ALoptions implements ActionListener {

        ALoptions() { }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
    
    class ALexit implements ActionListener {

        ALexit() { }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(1);
        }
    }
    
    class MKeyListener implements KeyListener {

        MKeyListener() { }
        
        @Override
        public void keyTyped(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
