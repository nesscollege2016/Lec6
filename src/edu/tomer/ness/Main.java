package edu.tomer.ness;

public class Main {

    public static void main(String[] args) {

        for (String i = ""; i.length() < 10; i+="*") {
            //print (10- i.length()) spaces before the stars!
            for (int j = 0; j < 10 - i.length(); j++) {
                System.out.print(" ");
            }

            System.out.println(i);
        }

    }
}
