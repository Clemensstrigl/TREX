import processing.core.PApplet;
import processing.core.PImage;

public class Dino {

	float x, y, h, w, gravity = 0.7f;
	float yspeed;
	PApplet window;
	PImage photo;
	boolean overlapX;
	boolean overlapY;
	boolean hit;
	int MAX_TIME = 10;
	int timer = MAX_TIME;
	int i;

	public Dino(float x, float y, PApplet win) {
		this.x = x;
		this.y = y;
		this.h = h;
		this.w = w;
		yspeed = 10;
		this.window = win;
		int i = 0;
		overlapX = false;
		overlapY = false;
	}

	public void jump() {
		gravity = 0.7f;
		y += yspeed;
		yspeed += gravity;

		if (window.keyPressed && y >= 500) {
			if (window.key == ' ') {
				yspeed = -10;

			}
		}

	}

	public void ground() {

		if (y > 500) {
			y = 500;
		}

	}

	public void draw() {
		if (timer > 0) {
			timer--;
		} else {
			i = i + 1;
			timer = MAX_TIME;
		}

		if (timer % 2 == 0) {
			photo = window.loadImage("C:\\Users\\cstrigl928\\Desktop\\main-character3.png");
			window.image(photo, x, y);
		} else {
			photo = window.loadImage("C:\\Users\\cstrigl928\\Desktop\\main-character2.png");
			window.image(photo, x, y);

		}
	}

	public float getx() {
		return x;
	}

	public float gety() {
		return y;
	}

	public float geth() {
		return h;
	}

	public float getw() {
		return w;
	}
	public int getI() {
		return timer;
	}

	public boolean isXIntervalOverlapping(float x1, float wD, float xO, float wO) {
		if (x1 >= xO && x1 + wD >= xO && x1 + wD <= xO + wO && x1 <= xO + wO) {
			return true;
		}

		return false;
	}

	public boolean isYIntervalOverlapping(float y1, float hD, float yO, float hO) {
		if (y1 >= yO && y1 <= yO + hO && (y1 + hD) >= yO && (y1 + hD) < +yO + hO) {
			return true;

		}
		return false;
	}

	public boolean isHitting(Obsticle o) {
		if (isXIntervalOverlapping(this.x, this.x + this.w, o.x, o.x + o.w) == true
				&& isYIntervalOverlapping(this.y, this.y + this.h, o.y, o.y + o.h) == true) {
			return true;

		}
		return false;
	}

}
