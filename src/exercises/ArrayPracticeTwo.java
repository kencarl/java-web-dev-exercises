package exercises;
import java.util.Arrays;
public class ArrayPracticeTwo {
    public static void main (String[] args) {
        String poem = "I would not, could not, in a box." +
                "I would not, could not with a fox." +
                "I will not eat them in a house. I will not eat" +
                " them with a mouse.";
        String[] poemArray = poem.split("\\.");
        //System.out.println(Arrays.toString(poemArray));
        for (String i : poemArray)
            System.out.println(i);

    }
}
