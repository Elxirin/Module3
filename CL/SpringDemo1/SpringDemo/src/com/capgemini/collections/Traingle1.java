package com.capgemini.collections;

import java.util.List;

import com.capgemini.FirstDemo.Point;

public class Traingle1 {
	
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for (Point point : points) {
			System.out.println("Point (" + point.getX()+", "+point.getY()+")");
		}
	}
	
	
	public void myInit() {
		System.out.println("My Init Method");
	}
	
	public void tearDown() {
		System.out.println("My Destroy method executed");
	}
}
