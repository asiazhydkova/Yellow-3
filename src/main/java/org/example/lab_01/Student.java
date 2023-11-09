package org.example.lab_01;

public class Student {
    private String name;
    private int rating;
    static double avgRating;
    private static int number = 0;
    private static int sum = 0;

    public Student() {
        number++;
    }

    public Student(String name) {
        if (name.isBlank() || name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
        number++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean betterStudent(Student student) {
        return this.getRating() > student.getRating();
    }

    public static double getAvgRating() throws ArithmeticException {
        return (double) sum / number;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 0) throw new IllegalArgumentException();
        this.rating = rating;
        sum += rating;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
