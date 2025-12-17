package com.BrickBreak;
import java.awt.*;

public class Ball {
	// Fouad Kadry
	//12/16/25
	// This creates a ball that can be bounced off of objects as well as having its size changed
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
	//Precon: none
	// Post: returns x position
	public int getXpos() {
		return xPos;
	}
	//Precon: none
	// Post: returns x velocity
	public int getVelocity() {
		return xVelo;
	}
	// Pre: int input
	// Post: changes velocity by input
	public void addVelocity(int z) {
		xVelo += z;
	}
	// Pre: int input
	// Post: gets x position
	public void setX(int z) {
		this.xPos = z;
	}
	// Pre: int input
	// Post: sets x velocity
	public void setXVelocity(int z) {
		this.xVelo = z;
	}
	// pre: int input
	// Post: sets y velocity
	public void setYVelocity(int z) {
		this.yVelo = z;
	}
	//Precon: none
	// Post: reverses x position
	public void reverseX() {
		this.xVelo *= -1;
	}
	//Precon: none
	// Post: reverses x position
	public void reverseY() {
		this.yVelo *= -1;
	}
	//Precon: none
	// Post: returns y position
	public int getYpos() {
		return yPos;
	}
	// Pre: int input
	// Post: sets y position
	public void setY(int z) {
		this.yPos = z;
	}
	//Precon: none
	// Post: returns radius
	public int getSize() {
		return radius;
	}
	//Precon: none
	// Post: moves based on velocities
	public void move() {
		xPos += xVelo;
		yPos += yVelo;
	}
	
	//constructor(s):
	
	//methods:
	//precondition: g is not null
	//postcondition: the ball is drawn
	public void draw(Graphics g) {
		g.setColor(Color.white);
           g.fillOval(xPos, yPos, radius, radius);
	}
	
}
