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

import javafx.scene.paint.Color;

/**
 *
 * @author Dano & Joshua
 */
public class motion {
   private JFrame frame;
  private  MalenPanel mp; 
   private int x =1;
  private int step =1;
  private int stepy =1;
  private int stepl=1;
  private int stepr=1;
  private int durchmesser =20;
  private int y=1;
    
    
    public void los(){
    frame = new JFrame("Astroiz");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    mp = new MalenPanel();
    frame.add(mp);
    
    frame.addKeyListener(new MKeyListener());
    
    frame.setSize(500,400);
    frame.setVisible(true);
    
    while (true) { 
      x=x+ step;
      y=y+ stepy;
      r=r+addr;
      l=l+addl;
      
      mp.repaint();
      try { 
        Thread.sleep(9);
      } catch(Exception e) {
        
      } 
      if (x>mp.getWidth()-durchmesser) {
        step=-1;
        //stepy=0;
      } // end of if
      if (x<0) {
        step =0;
        stepy=0;
      } // end of if
      if (y>mp.getHeight()-durchmesser) {
        stepy=-1;
      } // end of if
      if (y<0) {
        stepy =1;
      } // end of if
      
    
    }
    public class MalenPanel extends JPanel{
    public void paintComponent(Graphics g){
      g.setColor(Color.RED);
      g.fillRect(0,0,mp.getWidth(),mp.getHeight());
      g.setColor(Color.RED);
      
      
    }
  }
    
    
    
     public class MKeyListener implements KeyListener{
     public void keyTyped(KeyEvent e){
      char c = e.getKeyChar();
    }
    public void keyPressed(KeyEvent e){
      char c =e.getKeyChar();
      if (c=='w') addl=  -3; 
      if (c=='a') addl=   3;
      if (c=='s') addr=  -3;
      if (c=='d') addr=   3;
    }
    public void keyReleased(KeyEvent e){
      char c =e.getKeyChar();
      if (c=='w') addl=   0; 
      if (c=='a') addl=   0;
      if (c=='s') addr=   0;
      if (c=='d') addr=   0;
    }
    
}
