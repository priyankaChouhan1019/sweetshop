package com.brdl.sweetshop;

public class SweetProperties {
    enum Color {
        RED, BLUE, GREEN, WHITE;
    }

    enum Category {
        SUGAR_LESS, JAGGERY, GHEE, SUGAR;
    }

    String name;
    int id;
    Category category;
    int price;
    Color color;

    @Override
    public String toString() {
        return "SweetProperties{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", category=" + category +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
