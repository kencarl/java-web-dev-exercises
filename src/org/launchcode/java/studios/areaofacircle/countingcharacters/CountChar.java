package org.launchcode.java.studios.areaofacircle.countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountChar {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        //create new scanner

        Scanner input = new Scanner(System.in);
        //get user input
        System.out.println("Enter characters to count: ");
        //store input in a string
        String stringOfCharacters = input.nextLine();
        System.out.println(stringOfCharacters);
        //convert to a char array
        char[] charsInString = stringOfCharacters.toCharArray();
        //loop through character arrays
        for(char character : charsInString){
            if (charCount.containsKey(character)){
                charCount.put(character, charCount.get(character) +1);
            }
            else{
                charCount.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> eachChar : charCount.entrySet()){
            System.out.println(eachChar.getKey() + ": " + eachChar.getValue());
        }


    }
}
