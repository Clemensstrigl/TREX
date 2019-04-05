import processing.core.PApplet;
import processing.core.PImage;

public class Cactus extends Obsticle{
	float xCa, yCa;
	float hCa, wCa;
	float xspeedCac;
	PApplet window;
	PImage photo;
	
	int whichImage;
	int once;
	//String img2 = "C:\\Users\\cstrigl928\\Desktop\\cactus2.png";
	public Cactus(PApplet win, PImage img) {
		super(1200,500,46,23,8,0,2,img,win);
	}

	

	public void drawCactus() {
		if (xCa > 1200) {
			if (once == 0) {
				whichImage = (int) (Math.random() * 2 + 1);
				once++;
			} else {
				once++;
			}
		}
		if (xCa < 50) {
			once = 0;
		}
		if (whichImage == 1) {
			photo = window.loadImage("C:\\Users\\cstrigl928\\Desktop\\cactus1.png");
			window.image(photo, xCa, yCa);
			hCa = 46;
			wCa = 23;
		} else if (whichImage == 2) {
			photo = window.loadImage("C:\\Users\\cstrigl928\\Desktop\\cactus2.png");
			window.image(photo, xCa, yCa + 10);
			hCa = 33;
			wCa = 49;
		}
	}



}
