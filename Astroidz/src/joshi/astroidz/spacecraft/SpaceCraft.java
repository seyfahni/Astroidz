package joshi.astroidz.spacecraft;

import java.util.Collections;
import java.util.Set;
import joshi.astroidz.spacecraft.thrusters.Thruster;
import joshi.astroidz.spacecraft.weapons.Weapon;

public abstract class SpaceCraft {
	
	protected Set<Weapon> weapons;
	protected Set<Thruster> thrusters;

	public SpaceCraft(Set<Weapon> weapons, Set<Thruster> thrusters) {
		this.weapons = weapons;
		this.thrusters = thrusters;
	}
	
	public Set<Weapon> getWeapons() {
		return Collections.unmodifiableSet(weapons);
	}
	public Set<Thruster> getThrusters() {
		return Collections.unmodifiableSet(thrusters);
	}
}
