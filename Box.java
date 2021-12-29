package Lesson3.homework;

import java.util.ArrayList;

public class Box< T extends Fruit>{
    private ArrayList<T> fruitList = new ArrayList<>();


    public Box(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public Box() {
    }


    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }
    public float getWeight(){
        return fruitList.size() * fruitList.get(0).getWeight();
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitList=" + fruitList +
                '}';
    }

    public void pourOver(Box<T> box) {
        box.getFruitList().addAll(fruitList);
        fruitList.clear();
    }

    void info() {
        if (fruitList.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находятся " + fruitList.get(0).toString() + " в количестве: " + fruitList.size());
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void addFruit(T obj) {
        fruitList.add(obj);
    }

    void moveAt(Box<T> box) {
        box.getFruitList().addAll(fruitList);
        fruitList.clear();
    }

}
