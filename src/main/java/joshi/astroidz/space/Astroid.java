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

package joshi.astroidz.space;

import joshi.astroidz.util.Location;
import joshi.astroidz.util.Vector;

/**
 * The Astroid is the central objet of the game. Astroids are the inactive structure every player
 * has to evade.
 */
public final class Astroid implements Body {

    /**
     * Creates an new Astroid with an random size.
     */
    public Astroid() {
    }

    /**
     * Get the astroids size. With each hit the size decreases, sometimes the astroid splits.
     *
     * @return the astroids size
     */
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Location getLocation() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vector getVelocity() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setLocation(Location location) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setVelocity(Vector velocity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vector getAcceleration() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setAcceleration(Vector acceleration) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
