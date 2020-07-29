package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task_5 {

    public static void main(String[] args) {
 /*       List<String> list_cat = new ArrayList<>();
        Cata cat = new Cata ();
        System.out.println(cat.name());

  */

        List<Cat> list_cat = new ArrayList<>();
        List<Dog> list_dog = new ArrayList<>();
        List<Duck> list_duck = new ArrayList<>();
        Cat cat1 = new Cat ("Behemoth", 5, "Black");
        Cat cat2 = new Cat ("Tom", 7, "Grey");
        Cat cat3 = new Cat ("Garfield", 2, "Ginger");
        Dog dog1 = new Dog ("Lassy", 13, "White");
        Dog dog2 = new Dog ("Lady", 2, "Brown");
        Dog dog3 = new Dog ("Jake", 6, "Yellow");
        Duck duck1 = new Duck ("Huey", 1, "male");
        Duck duck2 = new Duck ("Dewey", 2, "male");
        Duck duck3 = new Duck ("Louie", 3, "male");
        list_cat.add(cat1);
        list_cat.add(cat2);
        list_cat.add(cat3);
        list_dog.add(dog1);
        list_dog.add(dog2);
        list_dog.add(dog3);
        list_duck.add(duck1);
        list_duck.add(duck2);
        list_duck.add(duck3);
/*
        for (Cat listCat : list_cat) {
            printItemListCat(listCat);
        }
        for (Dog listDog : list_dog) {
            printItemListDog(listDog);
        }
        for (Duck listDuck : list_duck) {
            printItemListDuck(listDuck);
        }
*/

//вывод через ArrayList
/*
        System.out.println(list_cat);
        System.out.println(list_dog);
        System.out.println(list_duck);

 */
        HashMap<String, List> animals = new HashMap<>();
        animals.put("cats", list_cat);
        animals.put("dogs", list_dog);
        animals.put("ducks", list_duck);



        for (String key : animals.keySet()) {
            System.out.println(key);
            if (key.equals("cats")){
                for (Cat listCat : list_cat) {
                    printItemListCat(listCat);
                    System.out.println("\t" + listCat);
                }
            }
            if (key.equals("dogs")){
                for (Dog listDog : list_dog) {
                    printItemListDog(listDog);
                    System.out.println("\t" + listDog);
                }
            }
            if (key.equals("ducks")){
                for (Duck listDuck : list_duck) {
                    printItemListDuck(listDuck);
                    System.out.println("\t" + listDuck);
                }
            }
            System.out.println();
        }

/*
        for (Map.Entry entry: animals.entrySet()) {
            System.out.println(entry);
        }
*/


//            System.out.println(animals);

 //       System.out.println(animals);
/*
        for (int j = 0; j < animals.size(); j++){
//            Cat el = list_cat.get(j);
            System.out.println(animals);
*/

//        list_cat.add(cat1);
//        System.out.println(list_cat.toString());
//        System.out.println(list_cat.size());
/*
        for (int j = 0; j < list_cat.size(); j++){
            Cat el = list_cat.get(j);
            System.out.println(el);
        }
*/

/*
        for(int i = 0; i<list_cat.size(); i++) {
            Cat value = list_cat.get(i);
            System.out.println(value);
        }
*/
/*
        String[] array = new String[list_cat.size()];
        list_cat.toArray(array);
        for(int i = 0; i< array.length; i++) {
            System.out.println(array[i]);
        }
*/
        }

    private static void printItemListCat(Cat listCat) {
        System.out.println(listCat);
    }
    private static void printItemListDog(Dog listDog) {
        System.out.println(listDog);
    }
    private static void printItemListDuck(Duck listDuck) {
        System.out.println(listDuck);
    }

    static class Cat {
            String name;
            int age;
            String color;

            Cat(String name, int age, String color) {
                this.name = name;
                this.age = age;
                this.color = color;
            }

        @Override
        public String toString() {
            return  "Name: " + name + ", Age: " + age + ", Color: " + color;
        }
    }

    static class Dog {
        String name;
        int age;
        String color;
        Dog(String name,int age,String color){
            this.name = name;
            this.age = age;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Color: " + color;
        }
    }

    static class Duck {
        String name;
        int age;
        String sex;

        Duck(String name, int age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Age: " + age + ", Sex: " + sex;
        }
    }
}
