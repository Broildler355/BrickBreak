package com.BrickBreak;
import java.awt.*;

public class Ball {
	private int radius;
	private int xPos;
	private int yPos;
	private int xVelo = 3;
	private int yVelo = 2;
	//your code here!
	public Ball(int x, int y, int r) {
		this.xPos = x;
		this.yPos = y;
		this.radius = r;
	}

	
	//don't forget you need instance variables:
	public int getXpos() {
		return xPos;
	}
	public int getVelocity() {
		return xVelo;
	}
	public void addVelocity(int z) {
		xVelo += z;
	}

	public void setX(int z) {
		this.xPos = z;
	}

	public void setXVelocity(int z) {
		this.xVelo = z;
	}

	public void setYVelocity(int z) {
		this.yVelo = z;
	}

	public void reverseX() {
		this.xVelo *= -1;
	}

	public void reverseY() {
		this.yVelo *= -1;
	}

	public int getYpos() {
		return yPos;
	}

	public void setY(int z) {
		this.yPos = z;
	}

	public int getSize() {
		return radius;
	}

	public void move() {
		xPos += xVelo;
		yPos += yVelo;
	}
	
	//constructor(s):
	
	//methods:
	//precondition: g is not null
	//postcondition: the brick is drawn using the color corresponding to its HP value.
	public void draw(Graphics g) {
		g.setColor(Color.white);
           g.fillOval(xPos, yPos, radius, radius);
	}
	
}
