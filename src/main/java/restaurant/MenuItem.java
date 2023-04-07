package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class MenuItem {

    //on my own
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateAdded;

    public MenuItem(String name, double price, String description, String category, boolean isNew, Date date) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

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

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return description.equals(menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        String thisIsNew = null;
        if (isNew){
             thisIsNew = "New Item!";
        } else {
             thisIsNew = " ";
        }

        return "MenuItem \n" +
                name +
                "  $" + price +
                '\n' + description +
                '\n' + category +
                '\n' + "Date Added= " + dateAdded + " "+
                '\n'+ thisIsNew;
    }
}

