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
