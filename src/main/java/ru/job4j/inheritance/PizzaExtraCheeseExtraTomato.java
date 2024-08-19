package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String NAME_WITH_CHEESE_TOMATO = " + Extra Tomato ";

    @Override
    public String name() {
        return super.name() + NAME_WITH_CHEESE_TOMATO;
    }
}
