/*
 * The MIT License
 *
 * Copyright 2015 Joshua and Dano.
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

package joshi.astroidz.main;

/**
 * The man class contains only the startup method.
 */
public final class Main {
    
    private Main() { }

    /**
     * The main method.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
         try {
      Display.setDisplayMode(new DisplayMode(800,800));
      Display.setTitel("Astroiz");
      Display.create();
    } catch(LWJGLException e) {
      System.out.println(e.getMessage());
      Display.destroy();
      System.exit(1);
    } // end of try
    glMatrixMode(GL_projektion);
     glOrtho(0,800,600,1,-1)
    glMatrixMode(GLMODELVIEW)
    
    while (!Display.isCloseRepuested()) {
      glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
      glBegin(GL_QUADS);
      
      
      
      glEnd();
      Display.update();
      
    } // end of while
    Display.destroy();
    System.exit(0);       
    }
}
