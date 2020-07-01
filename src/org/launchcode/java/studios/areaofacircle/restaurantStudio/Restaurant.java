package org.launchcode.java.studios.areaofacircle.restaurantStudio;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem spaghetti = new MenuItem(14.99, "Tomato sauce and noodles", "Pasta", true);
        MenuItem burger = new MenuItem (9.99, "100% angus beef", "Burger", true);
        MenuItem tacos = new MenuItem (10.99, "All you can eat", "Value", false);

        Date todaysDate = Calendar.getInstance().getTime();
        ArrayList<MenuItem> firstMenu = new ArrayList<>();
        Menu theMenu = new Menu(todaysDate, firstMenu);

        theMenu.addItem(spaghetti);
        theMenu.addItem(burger);
        theMenu.addItem(tacos);

        theMenu.printMenu();

        theMenu.removeItem(tacos);
        theMenu.printMenu();

    }
}
