package singletonpattern;

import domein.ChocolateBoiler;

public class SingletonPattern {

    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        System.out.println(chocolateBoiler);
    }
}
