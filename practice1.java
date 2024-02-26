package day9;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Input breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;

        System.out.println("Area of rectangle: " + (int)area);
    }
}
