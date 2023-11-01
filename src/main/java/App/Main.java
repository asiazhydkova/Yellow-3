package App;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
            people[i].input();
        }

        for (Person person : people) {
            person.output();
        }
    }
}