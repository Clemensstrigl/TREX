import processing.core.PApplet;
import processing.core.PImage;

public class Obsticle {
	protected float xspeed, yspeed;
	protected float x, y;
	protected float h, w;
	protected int MAX_TIME = 10;
	protected int timer = 5;
	protected double MAX_SPEED_FOR_TIME = 100;
	protected int i;
	protected double q;
	protected int distance;
	PApplet window;
	PImage img;
	private int whichImage;
	protected boolean OffScreen = false;

	public Obsticle(float x, float y, float w, float h, float xspeed, float yspeed, double q, PImage img, PApplet win) {
		this.x = x;
		this.y = y;
		this.xspeed = xspeed;
		this.yspeed = yspeed;
		this.window = win;
		this.q = q;
		this.w = w;
		this.h = h;
		this.img = img;
	}

	public void draw() {
		window.image(img, x, y);
	}

	public void moveX() {
		x -= xspeed;

		if (i == MAX_SPEED_FOR_TIME) {
			xspeed = xspeed + 1;
			MAX_SPEED_FOR_TIME += 100;
		}

	}

	public void moveY() {
		y = 500;
	}



	public void update() {
		if (timer == 0) {
			i++;
			timer = 5;
		}
		timer--;
	}

	public float getObstaclex() {
		return x;
	}

	public float getObstacley() {
		return y;
	}

	public float getObstacleh() {
		return h;
	}

	public float getObstaclew() {
		return w;
	}

	public float getObstacleXSpeed() {
		return xspeed;
	}

	public void displayCounter() {
		window.stroke(255);
		window.strokeWeight(5);
		window.textAlign(1200, 100);
		window.textSize(50);
		window.text(i, 1000, 100);
	}

	public boolean OffScreen() {
		if (x <= -10) {
			OffScreen = true;
		}
		else {
			OffScreen = false;
		}
		return OffScreen;
	}
}
