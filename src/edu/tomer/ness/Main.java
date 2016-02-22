package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;

        int counter = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            System.out.println(num < 100 && num > 0 ? "In Range": "Not in range");
            if (num < 100 && num > 0){
                sum = sum + num;
                counter++;
            }
        }
        System.out.println(sum / counter);
    }
}
