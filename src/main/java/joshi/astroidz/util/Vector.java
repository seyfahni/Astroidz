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
 * An math vector.
 */
public final class Vector {

    private final double x;
    private final double y;

    /**
     * Create a new vector with the given values.
     *
     * @param x the x value
     * @param y the y value
     */
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get the vectors x value.
     *
     * @return the x value
     */
    public double getX() {
        return this.x;
    }

    /**
     * Get the vectors y value.
     *
     * @return the y value
     */
    public double getY() {
        return this.y;
    }

    /**
     * Add a vector to this one.
     *
     * @param vector the vector to add
     * @return a new vector that is this + vector
     */
    public Vector add(Vector vector) {
        return add(vector.getX(), vector.getY());
    }

    /**
     * Add values to this vector.
     *
     * @param xToAdd x value to add
     * @param yToAdd y value to add
     * @return a new vector that is this + (x;y)
     */
    public Vector add(double xToAdd, double yToAdd) {
        return new Vector(this.x + xToAdd, this.y + yToAdd);
    }

    /**
     * Subtract a vector from this one.
     *
     * @param vector the vector to subtract
     * @return a new vector that is this - vector
     */
    public Vector subtract(Vector vector) {
        return add(vector.getX(), vector.getY());
    }

    /**
     * Subtracts values from this vector.
     *
     * @param xToSubtract x value to subtract
     * @param yToSubtract y value to subtract
     * @return a new vector that is this - (x;y)
     */
    public Vector subtract(double xToSubtract, double yToSubtract) {
        return new Vector(this.x - xToSubtract, this.y - yToSubtract);
    }

    /**
     * Multiply this vector with a scalar.
     *
     * @param scalar the multiplicant
     * @return the new vector
     */
    public Vector multiply(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar);
    }

    /**
     * Divide this vector by a scalar.
     *
     * @param scalar the value to divide by
     * @return the new vector
     */
    public Vector divide(double scalar) {
        return new Vector(this.x / scalar, this.y / scalar);
    }

    /**
     * Calculate the length of this vector.
     *
     * @return this vectors length
     */
    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    /**
     * Create an unit vector of this vector.
     *
     * @return the unit vector
     */
    public Vector unit() {
        return divide(length());
    }
}
