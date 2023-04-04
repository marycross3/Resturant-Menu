package org.example;

import restaurant.MenuItem;
import restaurant.Menu;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        MenuItem eggs = new MenuItem("eggs");
        HashMap<Integer, MenuItem> breakfastItems = new HashMap();
        breakfastItems.put(1, eggs);
        Menu breakfast = new Menu(breakfastItems);
        System.out.println(breakfast);
    }
}