package com.Restourant;

import com.sun.jdi.Value;

public enum Dishes {
    HOT_DOG(55,"Hot-Dog"),
    PIZZA(230,"Pizza"),
    CHEESEBURGER(140,"CheeseBurger"),
    BURGER(140,"Burger"),
    BBQBURGER(145,"BbqBurger"),
    GRILLED_CHICKEN(165,"Grilled Chicken"),
    GRILLED_DUCK(189,"Grilled Duck"),
    FRENCH_FRIES(45,"French Fries"),
    NUGGETS(65,"Nuggets"),
    KETCHUP(15,"Ketchup"),
    MAYONNAISE(15,"Mayonnaise"),
    MUSTARD(15,"Mustard"),
    BLACK_TEA(25,"Black Tea"),
    GREEN_TEA(25,"Green Tea"),
    BLACK_COFFEE(35, "Black Coffee"),
    COFFEE_WITH_MILK(40,"Coffee With Milk"),
    CAPPUCHINO(40,"Cappuchino");
    private int value;
    private String name;

    public int getValue()
    {
        return value;
    }

    Dishes(int value,String name)
    {
        this.value = value;
        this.name = name;
    }

    public static void PrintMenu()
    {
        for(Dishes item:Dishes.values())
        {
            System.out.println(item.name + " " + item.value + "UAH");
        }
    }
}
