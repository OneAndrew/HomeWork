import java.util.Scanner;
public class Homework_4_2 {
    public static void main (String[]args){
        Scanner kb = new Scanner (System.in);
        String word = "";

        System.out.print("Enter your data: ");
        word = kb.nextLine();

        uniqueCharacters(word);
    }

    public static void uniqueCharacters(String test) {
        String temp = "";
        for (int i = 0; i < test.length(); i++){
            char current = test.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                    temp = temp.replace(String.valueOf(current), "");
            }
        }

        System.out.println(temp + " ");

    }
}