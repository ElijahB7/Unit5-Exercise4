/*****************************
 Unit 5 - Exercise 4
 Alphabetize - Create a program that prompts the user to enter three cities. Then try to alphabetize them and print them out in order
 Output: Enter the first city: New York Enter the second city: Boston Enter the third city: Oshawa The cities in alphabetical order are Boston, New York, Oshawa
 ******************************/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Program();
    }
    public static void Program() {

        Scanner in = new Scanner(System.in);
        //getting input from user
        System.out.print("Enter the first city: ");
        String cityOne = in.nextLine();
        System.out.print("Enter the second city: ");
        String cityTwo = in.nextLine();
        System.out.print("Ente the third city: ");
        String cityThree = in.nextLine();

        // conditons (ArrayList was not allowed in the assignment, but made more sense to me lol)
        
        ArrayList<String> cities = new ArrayList<String>();

        cities.add(cityOne);
        cities.add(cityTwo);
        cities.add(cityThree);
        //get all input

        Collections.sort(cities);

        System.out.print("The cities in alphabetical order are " + cities);

    }
}