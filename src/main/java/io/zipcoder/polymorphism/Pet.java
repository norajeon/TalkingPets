package io.zipcoder.polymorphism;


/**
 * Create a Pet class, and a subclass for each type of pet
 * that you want your program to support.
 * Your classes should follow the following requirements:
 *
 * You must support at least three types of pets.
 * Dog must be one of the types you support.
 * Cat must be one of the types you support.
 * The Pet class must have a speak method that each subclass overrides.
 * The Pet class must have a name field with setters and getters.
 * Use the tests provided as examples to write your own tests for other supported types of pets.
 */

public class Pet {
private String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
    }
    public String speak() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }



}
