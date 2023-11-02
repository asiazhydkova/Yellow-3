package org.example.homeworktaskbird;


class ChickenKiwi extends NonFlyingBird {
	public ChickenKiwi() {
		super("ChickenKiwi feathers", true);
	}

	@Override
	public void fly() {
		System.out.println("The ChickenKiwi");
	}
}