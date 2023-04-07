package org.example;

import restaurant.MenuItem;
import restaurant.Menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem soup = new MenuItem("soup", 3.99, "hot soup", "side", true, new Date() );
        MenuItem salad = new MenuItem("salad", 4.99, "house salad", "side", false, new Date() );
        MenuItem salad2 = new MenuItem("salad", 2.99, "house salad", "side", false, new Date() );

        MenuItem cookie = new MenuItem("cookie", 1.99, "chocolate chip", "dessert", false, new Date() );
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        Menu myRestaurantMenu = new Menu(new Date(), menuItems);
        //System.out.println(myRestaurantMenu.printItem(soup));
        myRestaurantMenu.addItem(soup);
        myRestaurantMenu.addItem(salad);
        myRestaurantMenu.addItem(cookie);
        myRestaurantMenu.addItem(salad2);
        System.out.println(myRestaurantMenu);
        myRestaurantMenu.removeItem(soup);
        System.out.println("\n"+myRestaurantMenu);
        //System.out.println(salad2.equals(salad));


    }
}