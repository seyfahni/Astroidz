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

public final class Vector {
    
    private final double x;
    private final double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector(Vector v) {
        this.x = v.getX();
        this.y = v.getY();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public Vector add(Vector v) {
        return add(v.getX(), v.getY());
    }
    
    public Vector add(double x, double y) {
        return new Vector(this.x + x, this.y + y);
    }

    public Vector subtract(Vector v) {
        return add(v.getX(), v.getY());
    }
    
    public Vector subtract(double x, double y) {
        return new Vector(this.x - x, this.y - y);
    }

    public Vector multiply(double s) {
        return new Vector(x * s, y * s);
    }

    public Vector divide(double s) {
        return new Vector(x / s, y / s);
    }
    
    public double length() {
        return Math.sqrt(x*x + y*y);
    }
    
    public Vector unit() {
        return divide(length());
    }
}
