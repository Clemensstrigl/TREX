import processing.core.PApplet;

public class Counter {
	int i;
	double q;
	PApplet window;

	int MAX_TIME = 10;
	int timer = MAX_TIME;

	public Counter(PApplet win) {
		this.window = win;
		i = 0;
		q = 2;
	}

	public void update() {
		if (timer > 0) {
			timer--;
		} else {
			i = i + 1;
			timer = MAX_TIME;

			if (i == 100) {
				q = 1.9;
			}
			if (i == 300) {
				q = 1.8;
			}
			if (i == 500) {
				q = 1.7;
			}
			if (i == 700) {
				q = 1.6;
			}
			if (i == 900) {
				q = 1.5;
			}
			if (i == 1000) {
				q = 1.4;
			}
			if (i == 2000) {
				q = 1.3;
			}
		}
	}

	public void displayCounter() {
		window.stroke(255);
		window.strokeWeight(5);
		window.textAlign(1200, 100);
		window.textSize(50);
		window.text(i, 1000, 100);
	}
}
