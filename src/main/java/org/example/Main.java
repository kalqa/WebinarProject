package org.example;

public class Main {
    public static void main(String[] args) {
        FoodFinder foodFinder = new FoodFinder();
        Food food = foodFinder.find();
        System.out.println(food);
    }
}
