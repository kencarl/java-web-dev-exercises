package exercises;

public class ArrayPractice {
    public static void main(String [] args){
       int [] array;
       array = new int[]{1,1,2,3,5,8};

        for (int i = 0; i < 6; i++) {
           if (array[i]%2 != 0)
            System.out.println(array[i]);
        }

    }
}
