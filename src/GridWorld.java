import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.*;

public class GridWorld {
	public static void main(String[] args) {
		World donald = new World();
		donald.show();
		Bug bannon = new Bug();
		Location usa0 = new Location(0, 5);
		Location usa = new Location(1, 5);
		Location usa2 = new Location(2, 5);
		Location usa3 = new Location(3, 5);
		bannon.setColor(Color.cyan);
		bannon.setDirection(270);
		donald.add(usa, bannon);
		donald.add(usa2, bannon);
		donald.add(usa3, bannon);
		donald.add(usa0, bannon);
		for (int i = 4; i < 10; i++) {
			Location usa4 = new Location(i, 5);
			donald.add(usa4, bannon);
		}
		Flower trump = new Flower();
		for (int i = 0; i < 10; i++) {
			Location russia = new Location(i, 4);
			donald.add(russia, i);
		}
	}
}
