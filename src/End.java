import processing.core.PApplet;

public class End {
	PApplet window;
	public End(PApplet win) {
		this.window = win;
		String opt = "Game Over" + "\nRetry?";
	}
	public void displayEnd(String opt) {
		window.fill(255);
		window.textSize(20);
		window.text(opt, 375, 630);
		window.background(0);
		window.rect(200, 500, 200, 600);
		
	}
	
}
