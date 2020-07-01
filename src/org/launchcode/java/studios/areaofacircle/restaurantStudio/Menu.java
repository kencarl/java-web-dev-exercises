package org.launchcode.java.studios.areaofacircle.restaurantStudio;
import java.util.Date;
import java.util.ArrayList;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItemsList;

    public Menu (Date lastUpdated, ArrayList<MenuItem> menuItemsList) {
        this.lastUpdated = lastUpdated;
        this.menuItemsList = menuItemsList;
    }
    public void setLastUpdated (Date aLastUpdated){
        this.lastUpdated = aLastUpdated;
    }
    public void setMenuItemsList (ArrayList<MenuItem> aMenuItemsList) {
        this.menuItemsList = aMenuItemsList;
    }
    public Date getLastUpdated(){
        return lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItemsList() {
        return menuItemsList;
    }

    public ArrayList<MenuItem> addItem(MenuItem item){
        this.menuItemsList.add(item);
        return this.menuItemsList;

    }
    public ArrayList<MenuItem> removeItem(MenuItem item){
        int itemToRemove = -1;
        for (int i = 0; i < menuItemsList.size(); i++)  {
            if (menuItemsList.get(i).equals(item)) {
                itemToRemove=i;
            }
        }
        this.menuItemsList.remove(itemToRemove);
        return this.menuItemsList;
    }
    public String menuLastUpdated(){
        return ("Last updated on: " + this.lastUpdated);
    }
    //printing out a single menu item
    public void printItem(MenuItem item){
        String itemDescription = item.getDescription(); //(item)
        System.out.println(itemDescription);
    }
    //printing entire menu
    public void printMenu(){
        for (int i = 0; i < menuItemsList.size(); i++){
            System.out.println(menuItemsList.get(i).getDescription());
        }
    }

}
