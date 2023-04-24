package com.ust.ioc2;

public class Line {
       Point p1;
       Point p2;
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Line(Point p1, Point p2) {
		System.out.println("from Line(p1,p2)....");
		this.p1 = p1;
		this.p2 = p2;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
		public void drawLine() {
			//for(int i=x1;i<x2;i++)
			//{
				System.out.println("from"+p1.getX()+","+p1.getY()+"....to...."+p2.getX()+","+p2.getY());
			//}
		}
		public void destroy() {
			System.out.println("from destroy()......");
		}
	}

