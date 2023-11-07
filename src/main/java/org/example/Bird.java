package org.example;

public class Main {
    public static void main(String[] args) {
        Eagle eagle1 = new Eagle(true, true);
        Eagle eagle2 = new Eagle(true,true);
        Swallow swallow1 = new Swallow(true, true);
        Penguin penguin1 = new Penguin(false, true);
        Chicken chicken1 = new Chicken(true,true);
        Chicken chicken2 = new Chicken(true,true);
        Bird [] birds = {eagle1, eagle2, swallow1, penguin1, chicken1, chicken2};
        /*eagle1.feathers = true;
        eagle2.feathers = true;
        swallow1.feathers = true;
        penguin1.feathers = false;
        chicken1.feathers = true;
        chicken2.feathers = true;
        eagle1.layEggs = true;
        eagle2.layEggs = true;
        swallow1.layEggs = true;
        penguin1.layEggs = true;
        chicken1.layEggs = true;
        chicken2.layEggs = true;

         */
        for (Bird bird : birds) {
            bird.fly();
            // System.out.println("The bird has feathers: " + bird.feathers + ". Lays eggs: " + bird.layEggs);
            System.out.println("The bird has feathers: " + bird.feathers + ". Lays eggs: " + bird.layEggs);
        }


    }
}

package org.example;

abstract class Bird {
    boolean feathers;
    boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public Boolean getFeathers() {
        return feathers;
    }
    public boolean hasFeathers() {
        return feathers;
    }
    public boolean layEggs(){
        return layEggs;
    }
    abstract void fly ();
    public Boolean setFeathers(Boolean feathers) {
        this.feathers = feathers;
        return feathers;
    }
}


package org.example;

public class FlyingBird extends Bird{
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.println("The bird is flying");
    }
}


package org.example;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.println("The Bird is not flying");
    }
}


package org.example;

public class Eagle extends FlyingBird{
    public Eagle (boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}


package org.example;

public class Swallow extends FlyingBird{
    public Swallow (boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}

package org.example;

public class Penguin extends NonFlyingBird {
    public Penguin (boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}

package org.example;

public class Chicken extends NonFlyingBird{
    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
}
