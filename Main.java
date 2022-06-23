package Lesson3HW;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача про фрукты");
        
        Basket<Apple> basket1 = new Basket<>(new Apple(1.0f), 15);
        Basket<Orange> basket2 = new Basket<>(new Orange(1.5f), 7);
        Basket<Apple> basket3 = new Basket<>(new Apple(1.0f), 20);


        System.out.println("Корзина №1" + basket1);
        System.out.println("Корзина №3" + basket3);
        System.out.println("Корзина №1 весит " + basket1.getMass());
        System.out.println("Корзина №3 весит " + basket3.getMass());

        System.out.println("Сравним веса корзины №1 и №2. Получим " + Basket.compare(basket1.getMass(), basket3.getMass()));

        System.out.println("Пересыпем фрукты из Корзины №3 в Корзину №1, получим " + Basket.pour(basket3, basket1) + " фруктов в Корзине №1");
        System.out.println("Корзина №3 " + basket3);
        System.out.println("Корзина №1 " + basket1);
        System.out.println("              ");


        System.out.println("Задача на замену элементов массива местими");

        String arr[] = new String[]  {"Winter", "Spring", "Summer", "Autumn"};
        for (int i = 1; i < arr.length; i++)
            i++;
        System.out.println(Arrays.toString(arr));

        changes(arr,3,1);
        System.out.println(Arrays.toString(arr));

    }

     public static void changes (String arr[], int i, int x){
         String tmp = arr[i];
         arr[i] = arr[x];
         arr[x] = tmp;
     }


    }

/*
1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 2. Задача:
   Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     Класс Basket, в который можно складывать фрукты.
        Коробки условно сортируются по типу фрукта,
        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        Для хранения фруктов внутри коробки можно использовать ArrayList;
        Сделать метод getWeight(), который высчитывает вес коробки,
        зная вес одного фрукта и их количество: вес яблока – 1.0f,
        апельсина – 1.5f (единицы измерения не важны);
        Внутри класса Basket сделать метод compare(),
       который позволяет сравнить текущую коробку с той,
       которую подадут в compare() в качестве параметра. true – если их массы равны,
        false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;

  *Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
   Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
   Соответственно, в текущей коробке фруктов не остается,
   а в другую перекидываются объекты, которые были в первой;
        Не забываем про метод добавления фрукта в коробку.*/
