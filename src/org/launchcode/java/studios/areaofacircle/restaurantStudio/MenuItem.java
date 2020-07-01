package org.launchcode.java.studios.areaofacircle.restaurantStudio;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem (double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }
    //setters
    public void setPrice(double aPrice){
        this.price = aPrice;
    }
    public void setDescription (String aDescription) {
        this.description = aDescription;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setIsNew(boolean aNew) {
        isNew = aNew;
    }
    // getters
    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
    public boolean getIsNew () {
        return isNew;
    }

    public String isMenuItemNew(){
        if (this.isNew) {
            return ("NEW");
        } else {
            return ("");
        }
    }
    public boolean isEqual(MenuItem itemToCompare){
        if (itemToCompare == this){
            return true;
        }
        if(itemToCompare == null){
            return false;
        }
        if(itemToCompare.getClass() !=getClass()) {
            return false;
        }
        MenuItem theItem = (MenuItem) itemToCompare;
        return theItem.getDescription()==getDescription();
    }
}
