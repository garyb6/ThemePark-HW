package people;

import attractions.Attraction;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> attractionsList;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.attractionsList = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Attraction> getAttractionsList() {
        return attractionsList;
    }
}
