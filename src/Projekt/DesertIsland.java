package Projekt;

import java.util.Arrays;
import java.util.Scanner;

public class DesertIsland {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options = {"Wife", "Coffee", "Netflix", "Sofa", "Running Shoes", "Guitar", "Candy", "Dog", "Book", "Beer"};
        System.out.println("""
                Which items would you want the most with you on a desert island
                1. Wife
                2. Coffee
                3. Netflix
                4. Sofa
                5. Running Shoes
                6. Guitar
                7. Candy
                8. Dog
                9. Book
                10. Beer
                Insert your choices:\s""");
        int[] userOptions = new int[options.length];
        int i;
        int a;

        for (i = 0; i < options.length; i++) {
            a = sc.nextInt();
            userOptions[a - 1] = userOptions[a - 1] + 1;
            System.out.println(options[a - 1]);
        }
        System.out.println("User Choices: " + Arrays.toString(userOptions));

        System.out.println("The most popular choice was: ");
        int tempMax = userOptions[1];
        int mostPopular = 0;

        for (i = 0; i < options.length; i++) {
            if (userOptions[i] > tempMax) {
                mostPopular = i;
                tempMax = userOptions[i];
            }
        }
        System.out.println(options[mostPopular]);
    }
}
