package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    //mcDev added
    private HashMap<Integer, MenuItem> items;

    public Menu(HashMap<Integer, MenuItem> items) {
        this.items = items;
    }

    public void setItems(HashMap<Integer, MenuItem> items){
        this.items = items;
    }
    public void printMenu(){
        //method to print
        System.out.println();
    }

    //on my own
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private boolean isAvailable;
    private boolean isVegan;
    private Date dateAdded;
    private ArrayList allergens;
    private int spiceLevel;
    private String proteinType;

    public void setPrice(double price){
        this.price = price;
    };

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory(){
        return this.category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setAllergens(ArrayList allergens) {
        this.allergens = allergens;
    }

    public ArrayList getAllergens() {
        return allergens;
    }

    public void setSpiceLevel(int spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public int getSpiceLevel() {
        return spiceLevel;
    }

    public void setProteinType(String proteinType) {
        this.proteinType = proteinType;
    }

    public String getProteinType() {
        return proteinType;
    }
}
