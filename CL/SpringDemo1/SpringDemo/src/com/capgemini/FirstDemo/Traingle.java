package com.capgemini.FirstDemo;

public class Traingle {
	
	/*private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public Traingle() {
		
	}
	
	public Traingle(String type) {
		this.type = type;
	}
	
	public Traingle(int height) {
		this.height = height;
	}
	
	public Traingle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(type+ " Triangle Drawn! with Height "+ height);
	}*/

	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println("Point A(" + pointA.getX()+", " + pointA.getY()+")");
		System.out.println("Point B(" + pointB.getX()+", " + pointB.getY()+")");
		System.out.println("Point C(" + pointC.getX()+", " + pointC.getY()+")");
	}
}
