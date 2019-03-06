import java.util.Scanner;

public class Homework_4_1 {
    public static void main(String[] args) {
        int num;
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        num = sc.nextInt();
        while(num > 0) {
            int x = num % 2;
            str = x + str;
            num = num / 2;
        }
        System.out.println("Your binary number is: " + str);
    }
}