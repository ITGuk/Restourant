package com.Restourant;

import com.sun.jdi.Value;

public enum Dishes {
    HOT_DOG(55),
    PIZZA(230),
    CHEESBURGER(140),
    BURGER(140),
    BBQBURGER(145),
    GRILLED_CHICKEN(165),
    GRILLED_DUCK(189),
    FRENCH_FRIES(45),
    NUGGETS(65),
    KETCHUP(15),
    MAYONNAISE(15),
    MUSTARD(15),
    BLACK_TEA(25),
    GREEN_TEA(25),
    BLACK_COFFE(35),
    COFFEE_WITH_MILK(40),
    CAPPUCHINO(40);
    private int value;

    public int getValue()
    {
        return value;
    }

    Dishes(int value)
    {
        this.value = value;
    }

    public static void PrintMenu()
    {
        for(Dishes item:Dishes.values())
        {
            System.out.println(item);
            System.out.println(item.value);
        }
    }
}
