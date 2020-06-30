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
}
