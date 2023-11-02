package  org.example.homeworktaskbird;

abstract class Bird {
	private String feathers;
	private boolean layEggs;

	public Bird(String feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public abstract void fly();
	
	public void displayInfo() {
		System.out.println("Feathers: " + feathers);
		System.out.println("Lay Eggs: " + (layEggs ? "Yes" : "No"));
	}
}