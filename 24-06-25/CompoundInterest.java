import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(); // principal
        double r = sc.nextDouble(); // rate
        double t = sc.nextDouble(); // time
        double ci = p * Math.pow((1 + r / 100), t) - p;
        System.out.println("Compound Interest: ₹" + ci);
    }
}
