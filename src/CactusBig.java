import processing.core.PApplet;
import processing.core.PImage;

public class CactusBig {
float xCa,yCa;
float hCa, wCa;
float xspeedCac;
PApplet window;
PImage photo;
int distance;
int whichCactus;
	public CactusBig( PApplet win){
		this.window =  win;
		xCa = 1200;
		yCa = 510;
		distance = (int)(Math.random()*501);
		xspeedCac = 8;
	}
	public void move() {
		xCa = xCa - xspeedCac;
		if(xCa <50) {
			xCa = 1200 + distance ;

		}
		
		
	}
	public void drawCactus() {
		photo = window.loadImage("C:\\Users\\cstrigl928\\Desktop\\cactus2.png");
		window.image(photo, xCa, yCa);

	}
	public float getCABx() {
		return xCa;
	}
	
}