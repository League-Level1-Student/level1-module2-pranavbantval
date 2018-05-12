import org.jointheleague.graphical.robot.Robot;

public class Method1 {
	Robot Tortoise = new Robot();

	void food(String fruit) {

		System.out.println("I like " + fruit);

	}

	void truth(int x) {

		if (x > 5)

			System.out.println("Geeks rule");

		else

			System.out.println("Nerds rule");

	}

	void drawLine() {
		Tortoise.penDown();
		Tortoise.setSpeed(100);
		Tortoise.move(100);

		Tortoise.turn(90);
	}

	public static void main(String[] args) {
		Method1 m = new Method1();
		m.food("apples");
		m.truth(5);
		for (int i = 0; i < 4; i++) {
			m.drawLine();
		}

	}
}

class Hell {
	private int hotness;

	Hell(int hotness) {
		this.hotness = hotness;

	}

}

class Bacon {

	private String style;

	Bacon(String style) {
		this.style = style;
	}

}

class Unicorn {
	private int horns;

	private Unicorn(int horns) {
		this.horns = horns;
	}

}

class Narwhal {
	private boolean thing;

	Narwhal(boolean thing) {
		this.thing = thing;
	}

}
