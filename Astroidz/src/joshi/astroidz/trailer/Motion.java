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
package joshi.astroidz.trailer;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Motion {
  private JFrame frame ;
  private MalenPanel MP ;
  private int x = 0;
  private int y = 0;
  private int YS = 0;
  private int XS = 0;
  private int addYS = 0;
  private int addXS = 0;
  private int step = 1 ;       
  private int stepY = -1 ;
  private int durchmesser = 20 ;
  public static void main(String[] args) {
    Motion m = new Motion();
    m.los();
  } // end of main
  private void los () {
    frame = new JFrame("Motion");          
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    frame.setSize(500,500);
    MP = new MalenPanel();
    frame.add(MP);
    frame.addKeyListener(new MKeyListener());
    frame.setVisible(true);
    
    while (true) { 
      x = x + step;
      y = y + stepY;
      System.out.println("x" + x+  " y "+y);
      YS = YS+ addYS;
      XS = XS + addXS;
      if (YS+addYS>MP.getHeight()-50-(MP.getHeight() / 10) || YS+addYS < 0) {
        YS -= addYS;
      } // end of while
      MP.repaint();
      try { 
        Thread.sleep(3,3);
      } catch(Exception e) {
      } // end of try
      if (x>MP.getWidth()-durchmesser-(MP.getHeight() / 25)) {
        step = -1;
        x = 5;
        y = YS;
        step= +1;
      }
      if (x<0) {
        step=1;
        x = 480;
        y = YS;
      } // end of if
      if (y>MP.getHeight()-50) {
        stepY = -1;
      }
      if (y<0) {
        stepY=1;
      } // end of if
    }
  } // end of class Malen
  
  public class MalenPanel extends JPanel {
    public void paintComponent (Graphics g)  {
      g.setColor(Color.black);
      g.fillRect(0,0,MP.getWidth(),MP.getHeight());
      g.setColor(Color.green);
      g.fillRect(XS,YS,20,20);
    }
  }
  
  public class MKeyListener implements KeyListener{
    public void keyTyped (KeyEvent e) {
      char c = e.getKeyChar();
    }
    public void keyPressed (KeyEvent e){
      char c = e.getKeyChar(); 
      if (c == 'w') addYS = -4;
      if (c == 's') addYS = 4;
      if (c == 'a') addXS = -4;
      if (c == 'd') addXS = 4;
    }
    public void keyReleased (KeyEvent e){
      char c = e.getKeyChar(); 
      if (c == 'w') addYS = 0;
      if (c == 's') addYS = 0;
      if (c == 'a') addXS = 0;
      if (c == 'd') addXS = 0;
    }
  }
}
