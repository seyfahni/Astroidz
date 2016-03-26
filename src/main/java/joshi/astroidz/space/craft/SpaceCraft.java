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

package joshi.astroidz.space.craft;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import joshi.astroidz.space.Item;
import joshi.astroidz.space.craft.thrusters.Thruster;
import joshi.astroidz.space.craft.weapons.Weapon;
import joshi.astroidz.util.Location;
import joshi.astroidz.util.Vector;

public abstract class SpaceCraft implements Item {

    private Location location;
    private Vector velocity;
    private Vector acceleration;

    private final Set<Weapon> weapons;
    private final Set<Thruster> thrusters;

    public SpaceCraft() {
        this.weapons = new CopyOnWriteArraySet<>();
        this.thrusters = new CopyOnWriteArraySet<>();
    }

    @Override
    public final Location getLocation() {
        return location;
    }

    @Override
    public final void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public final Vector getVelocity() {
        return velocity;
    }

    @Override
    public final void setVelocity(Vector velocity) {
        this.velocity = velocity;
    }

    @Override
    public final Vector getAcceleration() {
        return acceleration;
    }

    @Override
    public final void setAcceleration(Vector acceleration) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public final Set<Weapon> getWeapons() {
        return Collections.unmodifiableSet(weapons);
    }
    
    public final boolean addWeapon(Weapon weapon) {
        return weapons.add(weapon);
    }

    public final boolean removeWeapon(Weapon weapon) {
        return weapons.remove(weapon);
    }

    public final Set<Thruster> getThrusters() {
        return Collections.unmodifiableSet(thrusters);
    }
    
    public final boolean addThruster(Thruster thruster) {
        return thrusters.add(thruster);
    }

    public final boolean removeThruster(Thruster thruster) {
        return thrusters.remove(thruster);
    }

}
