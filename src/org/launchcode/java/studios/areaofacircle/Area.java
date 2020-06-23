package org.launchcode.java.studios.areaofacircle;

//import src.Circle;
import java.util.Scanner;
public class Area {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter circle radius: ");
        double radius = in.nextDouble();
        if (radius > 0) {
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);


        } else {
            System.out.println("Please enter a valid number");
        }
    }}
//    static boolean isNumber(String input){
//        try{
//            Integer.parseInt(input);
//        }
//        catch (NumberFormatException ex){
//            return false;
//        }
//        return true;
//    }
//}
