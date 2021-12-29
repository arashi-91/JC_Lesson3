package Lesson3.homework;

import java.util.Arrays;
import java.util.List;

public class Main {

        /* Задача 1. Написать метод, который меняет два элемента массива местами.
         (массив может быть любого ссылочного типа);*/
        /* Задача 2. :
a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можно использовать ArrayList;
d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их
количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
которую подадут в compare() в качестве параметра.
 true – если их массы равны, false в противоположном случае.
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.

    */


    public static void main(String[] args) {
        String[] arr = {"Начало", "1", "2", "3", "Конец"};


        System.out.println("Задача 1:\n" + Arrays.toString(arr));
        swapElements(arr, 1, 4);
        System.out.println(Arrays.toString(arr));


        System.out.println("Задача 2");
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));
        orangeBox.addFruit(new Orange(1.5f));

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1f));
        appleBox.addFruit(new Apple(1f));
        appleBox.addFruit(new Apple(1f));
        appleBox.addFruit(new Apple(1f));

        Box<Apple> appleBox1 = new Box<>();
        appleBox.addFruit(new Apple(1f));
        appleBox.addFruit(new Apple(1f));
        appleBox.addFruit(new Apple(1f));
        appleBox.addFruit(new Apple(1f));

        orangeBox.info();
        appleBox.info();
        appleBox1.info();


        Float orangeBoxWeight = orangeBox.getWeight();
        Float appleBoxWeight = appleBox.getWeight();
        Float appleBoxWeight1 = appleBox.getWeight();
        System.out.println("Вес коробки  с апельсинами: " + orangeBoxWeight);

        System.out.println("Вес коробки с яблоками: " + appleBoxWeight);
        System.out.println("Вес коробки1 с яблоками: " + appleBoxWeight1);


        System.out.println("Сравнить вес orangeBox и appleBox: " + orangeBox.compare(appleBox));
        System.out.println("Сравнить вес appleBox и appleBox1: " + appleBox.compare(appleBox));

        //orangeBox.moveAt(appleBox);
        appleBox.moveAt(appleBox1);

        orangeBox.info();
        appleBox.info();
        appleBox1.info();

    }



    private static <T> void swapElements(T[] array, int a1, int a2) {
        T tmp = array[a1];
        array[a1] = array[a2];
        array[a2] = tmp;
    }





    }





