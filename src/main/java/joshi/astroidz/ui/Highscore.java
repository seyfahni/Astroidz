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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * The highscore display.
 */
public class Highscore {

    /**
     * Create a new highscore display.
     */
    public Highscore() {
    }

    class HighscoreListener implements ActionListener {                

        private int anzahlPlayer;

        HighscoreListener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //Anzeige Highscor
        }

        /**
         * An method to sort the highscores.
         */
  System.out.println("Highscore");
  System.out.print("[");
  for (i=0;i<11;i++ ) {
    feld[i]= (int)(Math.random()*100);
    if (i==10) {
      System.out.print(feld[i]);
    } // end of if
    else {
      System.out.print(feld[i]+", ");
    } // end of if-else
  } // end of for
  System.out.print("]");
  public void sort(){
    for (i=0;i<11 ;i++ ) {
      for (j=0;j<11 ;j++ ) {
        if (feld[i]<feld[j]) {
          z= feld[i];
          feld[i]=feld[j];
          feld[j]=z;
        } // end of if
      } // end of for
    } // end of for
  } // end of class Highscore
}
        /*public void add(Player player) {        //Player muss nich bestimmt werden um hinzuzufügen
            arrayList[PlayerAnzahl] = player;
            PlayerAnzahl++;
        }*/
    }
}
