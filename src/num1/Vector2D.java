package num1;

import java.util.Locale;

public class Vector2D {
	public double vX;
	public double vY;
	public Vector2D(){
		this.vX=1;
		this.vY=1;
		count++;
	}
	public Vector2D(double x,double y){
		this.vX=x;
		this.vY=y;
		count++;
	}
	public Vector2D (Vector2D v){
		this.vX=v.vX;
		this.vY=v.vY;
		count++;
	}
	public void print(){
		System.out.println(String.format(Locale.US, "(%.2f, %.2f)", this.vX,this.vY));
	}
	public double length(){
		return Math.sqrt((this.vX*this.vX)+(this.vY*this.vY));
	}
	public void add(Vector2D v){
		 this.vX+=v.vX;
		 this.vY+=v.vY;
	 }
	public void sub(Vector2D v){
		 this.vX-=v.vX;
		 this.vY-=v.vY;
	 }
	public void scale(double scaleFactor){
		 this.vX*=scaleFactor;
		 this.vY*=scaleFactor;
	 }
	public void normalized(){
		double inv = (1 / this.length());
		this.scale(inv);
	 }
	public double dotProduct(Vector2D v){
      return this.vX*v.vX+this.vY*v.vY;
	 }
	public static int count=0;
}
