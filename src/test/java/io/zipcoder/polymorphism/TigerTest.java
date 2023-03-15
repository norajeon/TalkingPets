package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TigerTest {

    @Test
    public void testConstructor() {
        String expectedName = "Hiccup";
        Tiger tiger = new Tiger(expectedName);

        String actualName = tiger.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speak() {
        Tiger tiger = new Tiger ("Nora");

        String testBark = tiger.speak();
        String speak = "rawr!";

        Assert.assertEquals(speak, testBark);
    }


}