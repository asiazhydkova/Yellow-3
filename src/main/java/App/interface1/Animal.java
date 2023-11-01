package App.interface1;

import java.util.ArrayList;

public interface Animal {
    public void voice();
    public void feed();

}

class Cat implements Animal {
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("Cat food");
    }


}
class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("Dog food");
    }

}










