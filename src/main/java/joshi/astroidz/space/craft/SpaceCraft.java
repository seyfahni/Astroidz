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
import joshi.astroidz.space.Body;
import joshi.astroidz.space.craft.thrusters.Thruster;
import joshi.astroidz.space.craft.weapons.Weapon;
import joshi.astroidz.util.Location;
import joshi.astroidz.util.Vector;

/**
 * The spacecraft is the usercontrolled actor of the game.
 */
public abstract class SpaceCraft implements Body {

    private Location location;
    private Vector velocity;
    private Vector acceleration;

    private final Set<Weapon> weapons;
    private final Set<Thruster> thrusters;

    /**
     * Create a new spacecraft.
     */
    public SpaceCraft() {
        this.weapons = new CopyOnWriteArraySet<>();
        this.thrusters = new CopyOnWriteArraySet<>();
    }

    @Override
    public final Location getLocation() {
        return this.location;
    }

    @Override
    public final void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public final Vector getVelocity() {
        return this.velocity;
    }

    @Override
    public final void setVelocity(Vector velocity) {
        this.velocity = velocity;
    }

    @Override
    public final Vector getAcceleration() {
        return this.acceleration;
    }

    @Override
    public final void setAcceleration(Vector acceleration) {
        this.acceleration = acceleration;
    }

    /**
     * Get the the spacecrafts weapons.
     *
     * @return a unmodifiable Set of weapons
     */
    public final Set<Weapon> getWeapons() {
        return Collections.unmodifiableSet(this.weapons);
    }
    
    /**
     * Add a weapon to the ship.
     *
     * @param weapon the weapon to add
     * @return true if the weapon was not yet added to the spacecraft; false otherwise
     */
    public final boolean addWeapon(Weapon weapon) {
        return this.weapons.add(weapon);
    }

    /**
     * Removes a weapon from the ship.
     *
     * @param weapon the weapon to remove
     * @return false if the weapon was not yet added to the spacecraft; true otherwise
     */
    public final boolean removeWeapon(Weapon weapon) {
        return this.weapons.remove(weapon);
    }

    /**
     * Get the spacecrafts thrusters.
     *
     * @return a unmodifiable Set of thrusters
     */
    public final Set<Thruster> getThrusters() {
        return Collections.unmodifiableSet(this.thrusters);
    }
    
    /**
     * Add a thruster to the ship.
     *
     * @param thruster the thruster to add
     * @return true if the thruster was not yet added to the spacecraft; false otherwise
     */
    public final boolean addThruster(Thruster thruster) {
        return this.thrusters.add(thruster);
    }

    /**
     * Removes a thruster from the ship.
     *
     * @param thruster the thruster to remove
     * @return false if the thruster was not yet added to the spacecraft; true otherwise
     */
    public final boolean removeThruster(Thruster thruster) {
        return this.thrusters.remove(thruster);
    }

}
