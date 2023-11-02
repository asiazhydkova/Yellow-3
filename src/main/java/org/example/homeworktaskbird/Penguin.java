package  org.example.homeworktaskbird;

class Penguin extends NonFlyingBird {
	public Penguin() {
		super("Penguin feathers", true);
	}

	@Override
	public void fly() {
		System.out.println("The Penguin");
	}
}