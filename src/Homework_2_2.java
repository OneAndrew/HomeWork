public class Homework_2_2 {
    public static void main(String[] args) {
    int number = 123;
    int a = (number%10);
    int b = (number/10%10);
    int c = (number/100%10);

    String numbera = String.valueOf(a);
    String numberb = String.valueOf(b);
    String numberc = String.valueOf(c);

    String stringOfNumbers = numbera + numberb + numberc;

    int number2 = Integer.parseInt(stringOfNumbers);
        System.out.println(number - number2);

    }
}