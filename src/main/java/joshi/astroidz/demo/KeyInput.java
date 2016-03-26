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

/**
 * The KeyInput is an implementation of {@link java.awt.event.KeyListener} that provides simple but
 * thread-save methods to check for WASD movemend action.
 */
public final class KeyInput implements KeyListener {

    private final AtomicBoolean isMovingUp = new AtomicBoolean(false);
    private final AtomicBoolean isMovingDown = new AtomicBoolean(false);
    private final AtomicBoolean isMovingLeft = new AtomicBoolean(false);
    private final AtomicBoolean isMovingRight = new AtomicBoolean(false);

    /**
     * Creates a KeyInput instance.
     */
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
                this.isMovingUp.set(true);
                break;
            case 83: // s
                this.isMovingDown.set(true);
                break;
            case 65: // a
                this.isMovingLeft.set(true);
                break;
            case 68: // d
                this.isMovingRight.set(true);
                break;
            default:
                System.out.println("Pressed unrecognized key: " + keyEvent.getKeyChar()
                        + " (" + keyEvent.getExtendedKeyCode() + ")");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        switch (keyEvent.getExtendedKeyCode()) {
            case 87: // w
                this.isMovingUp.set(false);
                break;
            case 83: // s
                this.isMovingDown.set(false);
                break;
            case 65: // a
                this.isMovingLeft.set(false);
                break;
            case 68: // d
                this.isMovingRight.set(false);
                break;
            default:
                System.out.println("Released unrecognized key: " + keyEvent.getKeyChar()
                        + " (" + keyEvent.getExtendedKeyCode() + ")");
                break;
        }
    }
    
    /**
     * This method returns, dependent of keys that are pressed in the moment of call, the total
     * vertivcal movement direction. So if both the up and the down movement keys are pressed it
     * will return 0.
     * 
     * Upwards movement is represented by -1, downwards by 1 and no vertical movement by 0.
     *
     * @return 1, 0 or -1
     */
    public int getVerticalMovement() {
        int direction = 0;
        if (this.isMovingUp.get()) {
            direction--;
        }
        if (this.isMovingDown.get()) {
            direction++;
        }
        return direction;
    }

    /**
     * This method returns, dependent of keys that are pressed in the moment of call, the total
     * horizontal movement direction. So if both the right and the left movement keys are pressed it
     * will return 0.
     * 
     * Leftwards movement is represented by -1, rightwards by 1 and no horizontal movement by 0.
     *
     * @return 1, 0 or -1
     */
    public int getHorizontalMovement() {
        int direction = 0;
        if (this.isMovingLeft.get()) {
            direction--;
        }
        if (this.isMovingRight.get()) {
            direction++;
        }
        return direction;
    }
}
