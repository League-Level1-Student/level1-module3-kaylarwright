package extra;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) {
	World w = new World();
	w.show();
	Bug b = new Bug();
	Location l = new Location(3,3);
	w.add(l, b);
}
}
