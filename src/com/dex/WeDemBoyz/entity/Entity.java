package com.dex.WeDemBoyz.entity;

import java.util.Random;

import com.dex.WeDemBoyz.graphics.Screen;
import com.dex.WeDemBoyz.graphics.Sprite;
import com.dex.WeDemBoyz.level.Level;

public class Entity {

	protected int x, y;
	private boolean removed = false;
	protected Level level; //protected =can only be used in mob class and it subclasses.
	protected final Random random = new Random();
	protected Sprite sprite;
	/*
		public Entity(int x, int y, Sprite sprite) {
			this.x = x;
			this.y = y;
			this.sprite = sprite;
		}
	*/

	public void update() {

	}

	public void render(Screen screen) {
		if (sprite != null) screen.renderSprite((int) x, (int) y, sprite, true);
	}

	public void remove() {
		//Remove from level
		removed = true;
	}

	public boolean isRemoved() {
		return removed;
	}

	public Sprite getSprite() {
		return sprite;
	}

	public void init(Level level) {
		this.level = level;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
