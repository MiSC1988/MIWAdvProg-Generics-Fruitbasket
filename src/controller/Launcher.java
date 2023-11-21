package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;


public class Launcher {

    public static void main(String[] args) {
       // TODO Try and use the FruitBasket class for different kind of fruits and also for a mix of fruits

        FruitBasket<Fruit> appleFruitBasket = new FruitBasket<>();
        Apple apple = new Apple();
        Banana banana = new Banana();
        Pear pear = new Pear();

        appleFruitBasket.add(apple);
        appleFruitBasket.add(apple);
        appleFruitBasket.add(apple);
        appleFruitBasket.add(apple);

        appleFruitBasket.add(banana);
        appleFruitBasket.add(banana);

        appleFruitBasket.add(pear);

        System.out.println(appleFruitBasket);

        Fruit fruit = appleFruitBasket.get();
        System.out.println(appleFruitBasket);
        System.out.println(fruit);
    }
}