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
 * A body is any object that floates the virtual space in the game.
 */
public interface Body {

    /**
     * Get the bodies location at the moment of call.
     *
     * @return the bodies location
     */
    Location getLocation();
    
    /**
     * Change the bodies location to a new one.
     *
     * @param location the bodies new location
     */
    void setLocation(Location location);

    /**
     * Get the bodies velocity at the moment of call.
     *
     * @return the bodies velocity
     */
    Vector getVelocity();
    
    /**
     * Change the bodies velocity to a new one.
     *
     * @param velocity the bodies new velocity
     */
    void setVelocity(Vector velocity);
    
    /**
     * Get the acceleration the body experiences.
     *
     * @return the bodies acceleration
     */
    Vector getAcceleration();
    
    /**
     * Set the bodies acceleration.
     *
     * @param acceleration the bodies new acceleration
     */
    void setAcceleration(Vector acceleration);
    
}
