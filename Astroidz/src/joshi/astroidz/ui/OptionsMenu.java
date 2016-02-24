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

public class OptionsMenu {
  private JButton back;
  private JButton Steuerung;  
  private JLabel  label1;
  private JPanel panel1; 
  private JFrame frame;
  
  private boolean canClose = true;
  
  
  public static void main(String[] args) {
    Menu gui = new Menu();
    gui.OMenu(); 
  } // end of main
  public void OMenu (){
    
    frame = new JFrame("options Menu");
    panel1 = new JPanel();
    
   
    Steuerung = new JButton("Steuerung");
    back = new JButton("back");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    panel1.setLayout(new GridLayout(1,2));                                       //Layout
    panel1.add(Steuerung);                                                      //einfügenins Layout
    panel1.add(back);                                                          //einfügenins LAyout
   
    
    
    frame.setVisible(true);
    frame.setSize(400,400);
    
    
    
    Steuerung.addActionListener(new Steuerung());                               //Stuerung
    back.addActionListener(new back());  
    
  }
  
  
  public class back implements ActionListener{
 public void actionPerformed(ActionEvent e){
  
public void showDetails() {
   // code zum anzeigen der detail ansicht
   canClose = false;
}
 
public void showOverview() {
   // code zum anzeigen der übersicht
   canClose = true;
}
 
public void onBackPressed() {
    if (canClose) {
        super.onBackPressed();
    } else {
        showOverview();       
    }
  }
 }
}

public class Steuerung implements ActionListener{
 public void actionPerformed(ActionEvent e){
 
 
 }
}


}


  