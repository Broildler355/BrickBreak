package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	private int height;
	private int xPos;
	private int yPos;
	private int width;
	private int xVelo = 2;
	//your code here!
	public Paddle(int x, int y, int w, int h) {
		this.xPos = x;
		this.yPos = y;
		this.width = w;
		this.height = h;
	}

	
	//don't forget you need instance variables:
	public int getX() {
		return xPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	public int getVelocity() {
		return xVelo;
	}
	public void addVelocity(int z) {
		xVelo += z;
	}

	public void setX(int x) {
		this.xPos = x;
	}

	public void setVelocity(int x) {
		this.xVelo = x;
	}

	public int getY() {
		return yPos;
	}

	public void setY(int y) {
		this.yPos = y;
	}

	public void move() {
		xPos += xVelo;
	}
	
	//constructor(s):
	
	//methods:
	//precondition: g is not null
	//postcondition: the brick is drawn using the color corresponding to its HP value.
	public void draw(Graphics g) {
		g.setColor(Color.white);
           g.fillRect(xPos, yPos, width, height);
	}
	
}
