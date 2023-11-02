package  org.example.homeworktaskbird;

class Eagle extends FlyingBird {
	public Eagle() {
		super("Eagle Feathers", true);
	}

	@Override
	public void fly() {
		System.out.println("The Eagle");
	}
}