import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	Dino d;
	Counter h;
	Cactus c1, c2;
	End e;
	FireBall F;
	Dots dot;
	ArrayList<Dots> dots = new ArrayList<Dots>();
	PImage img1 = loadImage("C:\\Users\\cstrigl928\\Desktop\\cactus1.png");
	PImage img2 = loadImage("C:\\Users\\cstrigl928\\Desktop\\cactus2.png");
	PImage img3 = loadImage("C:\\Users\\cstrigl928\\Desktop\\cactus1.png");
	int Rand;
	int whichObject = (int) (Math.random() * 2);
	int once = 0;
	float t, u, l, k;

	public void setup() {
		size(1200, 600);
		background(4);
		d = new Dino(200, 500, this);
		h = new Counter(this);
		c1 = new Cactus(this, img1);
		c2 = new Cactus(this, img2);
		e = new End(this);
		F = new FireBall(this, img3);
		for (int i = 0; i < 100; i++) {
			dots.add(new Dots(this, 10, (float) (Math.random() * 1200)));
		}
	}

	public void draw() {
		background(211);
		fill(0);
		stroke(120);
		line(0, 543, 1200, 543);
		fill(0);
		
		if (whichObject == 0) {
			c1.displayCounter();
			c1.update();
			c1.draw();
			c1.moveX();
			t = c1.getObstaclex();
			u = c1.getObstacley();
			l = c1.getObstacleh();
			k = c1.getObstaclew();
			
		}

		if (whichObject == 2) {

			t = c2.getObstaclex();
			u = c2.getObstacley();
			l = c2.getObstacleh();
			k = c2.getObstaclew();

		}

		if (whichObject == 1) {

			t = F.getObstaclex();
			u = F.getObstacley();
			l = F.getObstacleh();
			k = F.getObstaclew();
			F.draw();
			F.moveX();
			F.moveY();
			F.update();
		}

		float a = d.getx();
		float r = d.gety();
		float g = d.getw();
		float s = d.geth();
		d.draw();
		d.jump();
		d.ground();

	
		F.draw();
		F.moveX();
		F.moveY();
		F.update();
		d.isXIntervalOverlapping(a, g, u, k);
		d.isYIntervalOverlapping(r, s, t, l);
		if (d.isHitting(c1) == true) {
			System.out.println("U Dead!!");
			System.exit(0);
		}

		for (int i = 0; i < dots.size(); i++) {
			dots.get(i).draw();
			dots.get(i).move();
			dots.get(i).resetPosition();
		}
		whichObject = NewObstacle();

	}

	public int NewObstacle() {
		if (c2.OffScreen() == true || c1.OffScreen() == true  || F.OffScreen() == true ) {
			whichObject = (int) (Math.random() * 2);
			System.out.println(whichObject);
		}

		return whichObject;
	}

}
