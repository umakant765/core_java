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
	public void setWidth() {
		this.width= width;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		int rArea=getLength()*getWidth();
		System.out.println("rectangle area= +rArea");
	}
	

}
