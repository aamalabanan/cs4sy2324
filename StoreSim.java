/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amuel
 */
public class StoreSim {
    public static void main(String[] args) {
        // Create items
        Item i1 = new Item("Burger", "food", 50);
        Item i2 = new Item("Fries", "food", 30);
        Item i3 = new Item("Fried Chicken", "food", 70);
        // ... Create other items

        // Create Stores
        Store mcdo = new Store("McDo");
        Store watsons = new Store("Watsons");
        Store mall = new Store("Supermall");

        mcdo.addItem(i1);
        mcdo.addItem(i2);
        mcdo.addItem(i3);
        Item i4 = null;

        watsons.addItem(i4);
        Item i5 = null;
        watsons.addItem(i5);
        Item i6 = null;
        watsons.addItem(i6);

        mall.addItem(i1);
        mall.addItem(i2);
        // ... Add more items to stores

        mall.filterType("food");
        mall.filterCheap(500);
        mall.filterExpensive(1000);

        mcdo.sellItem(0);
        mcdo.sellItem(50);
        watsons.sellItem("Soap");
        watsons.sellItem("Mouthwash");
        int i7 = 0;
        mall.sellItem(i7);
        mall.sellItem(i3);

        // Check final earnings
        Store.printStats();
    }
}