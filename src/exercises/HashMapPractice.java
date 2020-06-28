package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ID's

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.print("ID number: ");
                Integer newId = input.nextInt();
                students.put(newStudent, newId);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        //print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }


    }
}