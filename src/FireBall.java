import processing.core.PApplet;
import processing.core.PImage;

public class FireBall extends Obsticle{
	PApplet window;
	float x = 600;
	float y = 500;
	float xspeed;
	int RESPON_DISTANCE = (int) Math.random() * 500;
	PImage img;
	float counter = 0;

	public FireBall(PApplet win, PImage img) {
		super(1200,500,46,46,8,0,2,img,win);
		
	}


	public void moveY() {

		float Yposition = ((float) Math.sin(counter)) * 3;
		y = window.map(Yposition, -1, 1, 495, 500);
		counter += 0.4;
		if (counter >= 360) {
			counter = 0;
		}

	}

}