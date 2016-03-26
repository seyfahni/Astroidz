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

package joshi.astroidz.util;

/**
 * An absolute position in a world.
 */
public final class Location {

    private final double x;
    private final double y;

    /**
     * Creates a new location by giving coordinates.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Location(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get the x coordinate of the location.
     *
     * @return the locations x coordinate
     */
    public double getX() {
        return this.x;
    }

    /**
     * Get the y coordinate of the location.
     *
     * @return the locations y coordinate
     */
    public double getY() {
        return this.y;
    }
    
    /**
     * Move the location by a vector.
     *
     * @param vector the vector to move by
     * @return the moved location
     */
    public Location move(Vector vector) {
        return move(vector.getX(), vector.getY());
    }

    /**
     * Move the location by the given amount.
     *
     * @param deltaX the x to move the location
     * @param deltaY the y to move the location
     * @return the moved location
     */
    public Location move(double deltaX, double deltaY) {
        return new Location(this.x + deltaX, this.y + deltaY);
    }
}    
