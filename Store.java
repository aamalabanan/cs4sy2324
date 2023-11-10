/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amuel
 */
import java.util.ArrayList;

public class Store {
    private final String name;
    private double earnings;
    private final ArrayList<Item> itemList;
    private static final ArrayList<Store> storeList = new ArrayList<>();

    public Store(String name) {
        this.name = name;
        this.earnings = 0;
        this.itemList = new ArrayList<>();
        boolean add = storeList.add(this);
    }

    public String getName() {
        return name;
    }

    public double getEarnings() {
        return earnings;
    }

    public void sellItem(int index) {
        if (index >= 0 && index < itemList.size()) {
            Item item = itemList.get(index);
            earnings += item.getCost();
            System.out.println("Sold " + item.getName() + " for $" + item.getCost());
            itemList.remove(index);
        } else {
            System.out.println("There are only " + itemList.size() + " items in the store.");
        }
    }

    public void sellItem(String name) {
        for (Item item : itemList) {
            if (item.getName().equals(name)) {
                earnings += item.getCost();
                System.out.println("Sold " + item.getName() + " for $" + item.getCost());
                itemList.remove(item);
                return;
            }
        }
        System.out.println("The store doesn't sell " + name);
    }

    public void sellItem(Item item) {
        if (itemList.contains(item)) {
            earnings += item.getCost();
            System.out.println("Sold " + item.getName() + " for $" + item.getCost());
            itemList.remove(item);
        } else {
            System.out.println("The store doesn't sell this item.");
        }
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void filterType(String type) {
        for (Item item : itemList) {
            if (item.getType().equals(type)) {
                System.out.printf("Name: %s%nType: %s%nCost: %.2f%n", item.getName(), item.getType(), item.getCost());
            }
        }
    }

    public void filterCheap(double maxCost) {
        for (Item item : itemList) {
            if (item.getCost() <= maxCost) {
                System.out.printf("Name: %s%nType: %s%nCost: %.2f%n", item.getName(), item.getType(), item.getCost());
            }
        }
    }

    public void filterExpensive(double minCost) {
        for (Item item : itemList) {
            if (item.getCost() >= minCost) {
                System.out.printf("Name: %s%nType: %s%nCost: %.2f%n", item.getName(), item.getType(), item.getCost());
            }
        }
    }

    public static void printStats() {
        for (Store store : storeList) {
            System.out.println("Store Name: " + store.getName());
            System.out.println("Earnings: $" + store.getEarnings());
        }
    }
}
