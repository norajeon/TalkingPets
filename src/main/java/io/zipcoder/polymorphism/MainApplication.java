package io.zipcoder.polymorphism;
// package io.zipcoder.pets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainApplication {
    Map<String, String> pets;

    //Create a program that asks the user how many pets they have.
    //Once you know how many pets they have, ask them what kind of pet each one is,
    //along with each pet's name. For now your program should just hold
    //onto the user input and print out the list at the end.

    public MainApplication() {
        this.pets = new LinkedHashMap<>();

    }

    public Integer getHowManyPets() {
        Scanner scanner = new Scanner(System.in);
        Integer petCount = scanner.nextInt();
        return petCount;
    }

    public String getWhatKindOfPet() {
        Scanner scanner = new Scanner(System.in);
        String petType = scanner.nextLine();
        return petType;
    }

    public String getNameOfPet() {
        Scanner scanner = new Scanner(System.in);
        String petName = scanner.nextLine();
        return petName;
    }

    public static void main(String[] args) {
        MainApplication results = new MainApplication();
        System.out.println("\nHow many pets do you have?");
        Integer petCount = results.getHowManyPets();


        for (int i = 1; i <= petCount; i++) {
            System.out.println("\nWhat kind of pet is pet #" + i + "?");
            String petType = results.getWhatKindOfPet();

            System.out.println("\nWhat is the name of pet #" + i + "?");
            String petName = results.getNameOfPet();

            results.pets.put(petType, petName);

        }

        


        for(Map.Entry<String, String> ans :results.pets.entrySet()) {
            System.out.println(ans.getKey() + " " + ans.getValue());
        }




    } // main


} // class

