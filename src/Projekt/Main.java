package Projekt;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options = {"Wife", "Coffee", "Netflix", "Sofa", "Running Shoes", "Guitar", "Candy", "Dog", "Book", "Beer"};
        System.out.println("Which items would you want the most with you on a desert island" +
                "\n1. Wife" +
                "\n2. Coffee" +
                "\n3. Netflix" +
                "\n4. Sofa" +
                "\n5. Running Shoes" +
                "\n6. Guitar" +
                "\n7. Candy" +
                "\n8. Dog" +
                "\n9. Book" +
                "\n10. Beer" +
                "\nInsert your choices: ");
        int[] userOptions = new int[10];
        int i;
        int a;

        for (i = 0; i < 10; i++) {
            a = sc.nextInt();
            userOptions[a - 1] = userOptions[a - 1] + 1;
            System.out.println(options[a - 1]);
        }
        System.out.println("User Choices: " + Arrays.toString(userOptions));

        System.out.println("The most popular choice was: ");
        int tempMax = userOptions[1];
        int mostPopular = 0;

        for (i = 0; i < 10; i++) {
            if (userOptions[i] > tempMax) {
                mostPopular = i;
                tempMax = userOptions[i];
            }
        }
        System.out.println(options[mostPopular]);
    }
}
