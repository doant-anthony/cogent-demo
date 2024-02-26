package day9;

abstract class Marks{
    public abstract double getPercentage();
}

class A extends Marks{
    private double subject1;
    private double subject2;
    private double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public double getPercentage(){
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class B extends Marks{
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public B(double subject1, double subject2, double subject3, double subject4){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    public double getPercentage(){
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}

public class practice4 {
    public static void main(String[] args) {
        A studentA = new A(85, 82, 91);
        B studentB = new B(91, 75, 94, 80);

        System.out.println("Percentage of Student A: " + studentA.getPercentage()+ "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage()+ "%");
    }
}
