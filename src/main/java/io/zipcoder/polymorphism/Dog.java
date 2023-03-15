package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog (String name) {
        super(name); //from constructor
    }

    @Override
    public String speak() {
        return "bork bark";
    }

}
