package day9;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = scanner.nextLine();

        System.out.println("Input roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.println("Input field of interest: ");
        String fieldOfInterest = scanner.nextLine();

        System.out.println("Hey, my name is "+ name + " and my roll number is "+ rollNumber +"." + " My field of interest is "+ fieldOfInterest + ".");
    }
}
