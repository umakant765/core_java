package com.rays.abs;

public class Rectangle extends Shape {
	private int length;
	private int width;
	public int getLength() {
		return length;
		
	}
	public void setlength(int length) {
		this.length=length;
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width= width;
	}
	@Override
	public void area() {
		System.out.println("rectangle area= +rArea");
	}
	

}
