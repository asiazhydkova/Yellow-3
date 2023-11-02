package org.example.lab_02.homework_01;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    String fly() {
        return "Can't fly";
    }
}
