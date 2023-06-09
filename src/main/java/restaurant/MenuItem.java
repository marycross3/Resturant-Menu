package restaurant;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    //mcdev added
    private String name;

   public MenuItem(String name){
       this.name = name;
   }

    //what I had
    private Date dateUpdated;
    private ArrayList<MenuItem> items;

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
}
