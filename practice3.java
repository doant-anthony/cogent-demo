package day9;

import java.util.Scanner;

class Average{
    public void calculateAverage(double num1, double num2, double num3){
        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("The average is:" + average);
    }
}


public class practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Input the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Input the third number: ");
        double num3 = scanner.nextDouble();

        Average average = new Average();
        average.calculateAverage(num1, num2, num3);

    }
}