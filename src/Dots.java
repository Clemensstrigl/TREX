import processing.core.PApplet;

public class Dots {

	float x, y , xspeed;
	PApplet window;
	public Dots(PApplet win, float xspeed, float x ) {
		this.window  = win;
		this.xspeed = xspeed;
		this.x = x;
		y = (float)(Math.random()*400);
	}
	
	public void draw(){
		window.stroke(2);
		window.rect(x, y, 2, 2);
	}
	
	public void move() {
		x -= xspeed;
	}
	public void resetPosition() {
		if(x <= -10) {
			x = 1250;
			y = (float)(Math.random()*400);
		}
	}
}
