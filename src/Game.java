import java.awt.Canvas;

public class Game extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;

	public Game() {
		new Window(1000, 563, "Wizard Game", this);
	}
	
	public void run() {
		
	}
	
	public static void main(String args[]) {
		new Game();
	}
}
