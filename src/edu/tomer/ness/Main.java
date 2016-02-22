package edu.tomer.ness;

public class Main {

    public static void main(String[] args) {

        for (int rows = 0; rows < 20; rows++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(rows % 2 == 0? "*" : "^");
            }
            System.out.println();
        }

    }
}
