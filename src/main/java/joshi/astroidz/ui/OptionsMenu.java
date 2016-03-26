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

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The options menu display.
 */
public class OptionsMenu {

    private final JButton back;
    private final JButton steuerung;
    private JLabel label1;
    private final JPanel panel1;
    private final JFrame frame;

    private boolean canClose = true;

    /**
     * Create the options menu.
     */
    public OptionsMenu() {
        this.frame = new JFrame("options Menu");
        this.panel1 = new JPanel();

        this.steuerung = new JButton("Steuerung");
        this.back = new JButton("back");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel1.setLayout(new GridLayout(1, 2));           // Layout
        this.panel1.add(this.steuerung);                            // einfügenins Layout
        this.panel1.add(this.back);                                 // einfügenins LAyout

        this.frame.setVisible(true);
        this.frame.setSize(400, 400);

        this.steuerung.addActionListener(new Steuerung());     // Stuerung
        this.back.addActionListener(new Back());

    }

    /**
     * A main method to test the options menu.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        final OptionsMenu m = new OptionsMenu();
    }

    class Back implements ActionListener {

        Back() { }

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        public void showDetails() {
            // code zum anzeigen der detail ansicht
            OptionsMenu.this.canClose = false;
        }

        public void showOverview() {
            // code zum anzeigen der übersicht
            OptionsMenu.this.canClose = true;
        }

        public void onBackPressed() {
            if (OptionsMenu.this.canClose) {
                // TODO Was muss hier rein?!
            } else {
                showOverview();
            }
        }
    }

    class Steuerung implements ActionListener {

        Steuerung() { }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
