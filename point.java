/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Point{
	public double x;
	public double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public void rotate(double l, Point b){
		double x,y;
		l = Math.toRadians(l);
		x = (this.x-b.x)*Math.cos(l) - (this.y-b.y)*Math.sin(l);
		y = (this.x-b.x)*Math.sin(l) + (this.y-b.y)*Math.cos(l);
		this.x = Math.round(x+b.x);
		this.y = Math.round(y+b.y);
	}
}