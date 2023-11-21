package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stijn Crombach <s.crombach@st.hanze.nl>
 * Purpose of program
 */
public class FruitBasket<F extends Fruit> {
    private List<F> contents;

    public FruitBasket() {
        this.contents = new ArrayList<>();
    }

    public void add(F fruit) {
        contents.add(fruit);
    }

    public boolean contains(F fruit) {
        return contents.contains(fruit);
    }

    public boolean isEmpty() {
        return contents.isEmpty();
    }

    public int size() {
        return contents.size();
    }

    public F get() {
        F fruit = contents.get(size() - 1);
        contents.remove(fruit);
        return fruit;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (F fruit : contents) {
            stringBuilder.append(fruit).append("\n");
        }
        return stringBuilder.toString();
    }
}
