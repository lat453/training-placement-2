import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0, temp = num;
        while(temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(num % sum == 0 ? "Harshad Number" : "Not Harshad");
    }
}
