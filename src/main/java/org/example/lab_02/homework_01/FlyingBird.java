package org.example.lab_02.homework_01;

public class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    String fly() {
        return "Can fly";
    }
}
