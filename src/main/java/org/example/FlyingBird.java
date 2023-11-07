package org.example;

public class FlyingBird extends Bird{
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.println("The bird is flying");
    }
}
