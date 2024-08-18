package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String NAMEWITHCHEESETOMATO = " + Extra Tomato ";

    @Override
    public String name() {
        return super.name() + NAMEWITHCHEESETOMATO;
    }
}
