package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date dateUpdated;
    private ArrayList<MenuItem> items;
    public Menu(Date date, ArrayList<MenuItem> items){
        this.dateUpdated = new Date();
        this.items = items;

    }
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem name){
       // if (!items.contains(name)){
            this.items.add(name);
       // }
    }
    public void removeItem(MenuItem name){
        this.items.remove(name);
    }


    @Override
    public String toString() {
        return "Menu\n" +
                "dateUpdated=" + dateUpdated +
                ", items=" + items + "\n"
                ;
    }


}
