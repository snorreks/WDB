package com.level.tile.basic;

import com.graphics.Screen;
import com.graphics.Sprite;
import com.level.tile.Tile;

public class RockTile extends Tile {

	public RockTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this); //this betyr klassen selv awwwaw
		//Do render screen stuff
	}

	public boolean solid() {
		return true;
	}
	public boolean passthru() {
		return false;
	}
}
