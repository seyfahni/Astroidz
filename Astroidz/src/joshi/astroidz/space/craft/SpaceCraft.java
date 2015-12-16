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
	
	protected Location location;
	protected Vector velocity;
	
	protected Set<Weapon> weapons;
	protected Set<Thruster> thrusters;

	public SpaceCraft() {
		this.weapons = new CopyOnWriteArraySet<>();
		this.thrusters = new CopyOnWriteArraySet<>();
	}
	
	@Override
	public Location getLocation () {
		return location;
	}
	
	@Override
	public Vector getVelocity () {
		return velocity;
	}

	public Set<Weapon> getWeapons() {
		return Collections.unmodifiableSet(weapons);
	}
	public Set<Thruster> getThrusters() {
		return Collections.unmodifiableSet(thrusters);
	}
}
