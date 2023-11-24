package org.example;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.println("The Bird is not flying");
    }
}
