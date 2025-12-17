package com.BrickBreak;

import java.awt.*;

public class Paddle {
	// Fouad Kadry
	//12/16/25
	// This is a class that creates a paddle that you can move left and right, and can be shaped into any rectangular form
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
	//Precon: none
	// Post: returns x position
	public int getX() {
		return xPos;
	}
	//Precon: none
	// Post: returns ww\idth
	public int getWidth() {
		return width;
	}
	//Precon: none
	// Post: returns height
	public int getHeight() {
		return height;
	}
	//Precon: none
	// Post: returns velocity
	public int getVelocity() {
		return xVelo;
	}
	// Pre: int input
	// Post: changes velocity by input
	public void addVelocity(int z) {
		xVelo += z;
	}
	// Pre: int input
	// Post: sets new x position
	public void setX(int x) {
		this.xPos = x;
	}
	// Pre: int input
	// Post: sets new velocity
	public void setVelocity(int x) {
		this.xVelo = x;
	}
	//Precon: none
	// Post: returns y position
	public int getY() {
		return yPos;
	}
	// Pre: int input
	// Post: sets new y position
	public void setY(int y) {
		this.yPos = y;
	}
	//Precon: none
	// Post: moves on x-axis by x velocity
	public void move() {
		xPos += xVelo;
	}
	
	//constructor(s):
	
	//methods:
	//precondition: g is not null
	//postcondition: the brick is drawn
	public void draw(Graphics g) {
		g.setColor(Color.white);
           g.fillRect(xPos, yPos, width, height);
	}
	
}
