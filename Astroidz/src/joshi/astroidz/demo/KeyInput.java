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
package joshi.astroidz.demo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.atomic.AtomicBoolean;

public class KeyInput implements KeyListener {

    private final AtomicBoolean isMovingUp = new AtomicBoolean(false);
    private final AtomicBoolean isMovingDown = new AtomicBoolean(false);
    private final AtomicBoolean isMovingLeft = new AtomicBoolean(false);
    private final AtomicBoolean isMovingRight = new AtomicBoolean(false);

    public KeyInput() {
        System.out.println("Initialized Key-Listener!");
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getExtendedKeyCode()) {
            case 87: // w
                isMovingUp.set(true);
                break;
            case 83: // s
                isMovingDown.set(true);
                break;
            case 65: // a
                isMovingLeft.set(true);
                break;
            case 68: // d
                isMovingRight.set(true);
                break;
            default:
                System.out.println("Pressed unrecognized key: " + keyEvent.getKeyChar() + " (" + keyEvent.getExtendedKeyCode() + ")");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        switch (keyEvent.getExtendedKeyCode()) {
            case 87: // w
                isMovingUp.set(false);
                break;
            case 83: // s
                isMovingDown.set(false);
                break;
            case 65: // a
                isMovingLeft.set(false);
                break;
            case 68: // d
                isMovingRight.set(false);
                break;
            default:
                System.out.println("Released unrecognized key: " + keyEvent.getKeyChar() + " (" + keyEvent.getExtendedKeyCode() + ")");
                break;
        }
    }
    
    public int getVerticalMovement() {
        int direction = 0;
        if (isMovingUp.get()) {
            direction--;
        }
        if (isMovingDown.get()) {
            direction++;
        }
        return direction;
    }

    public int getHorizontalMovement() {
        int direction = 0;
        if (isMovingLeft.get()) {
            direction--;
        }
        if (isMovingRight.get()) {
            direction++;
        }
        return direction;
    }
}
