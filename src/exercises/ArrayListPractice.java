package exercises;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        //Arrays.asList(10,12,6,16,23,5,2,78,54,335);
        numbers.add(10);
        numbers.add(12);
        numbers.add(6);
        numbers.add(16);
        numbers.add(23);
        numbers.add(5);
        numbers.add(2);
        numbers.add(78);
        numbers.add(54);
        numbers.add(335);
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sum = sum + numbers.get(i);
            }
            //System.out.print(sum);
        } System.out.print(sum);
    }
}
