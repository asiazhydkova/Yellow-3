package  org.example.homeworktaskbird;

class Swallow extends FlyingBird {
	public Swallow() {
		super("Swallow feathers", true);
	}

	@Override
	public void fly() {
		System.out.println("The Swallow");
	}
}