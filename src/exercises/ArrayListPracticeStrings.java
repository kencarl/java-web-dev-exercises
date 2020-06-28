package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPracticeStrings {
    public static void main (String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int searchLength;
        strings.add("rough");
        strings.add("red");
        strings.add("tough");
        strings.add("bluff");
        strings.add("hat");

        System.out.println("Please enter word length to search:");
        searchLength = input.nextInt();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == searchLength ) {
                System.out.println(strings.get(i));
            }
        }
    }
}
