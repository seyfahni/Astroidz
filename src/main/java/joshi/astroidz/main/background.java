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
    public void los(){
   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    m = new ZeichenPanel();
    frame.add(m);  
        
    imageArray[0] = new ImageIcon("background.jpg").getImage();
    
      class ZeichenPanel extends JPanel{
    public void paintComponent(Graphics g){
      g.drawImage(imageArray[0],2,2,this);
        
     }
    }
   } 
}
