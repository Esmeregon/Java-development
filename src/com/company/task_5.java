package com.company;

import java.util.*;

public class task_5 {

    public static void main(String[] args) {
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
        HashMap<String, List> animals = new HashMap<>();
        animals.put("cats", list_cat);
        animals.put("dogs", list_dog);
        animals.put("ducks", list_duck);

        for (String key : animals.keySet()) {
            System.out.println(key);
            if (key.equals("cats")){
                for (Cat listCat : list_cat) {
                    printItemListCat(listCat);
                }
            }
            if (key.equals("dogs")){
                for (Dog listDog : list_dog) {
                    printItemListDog(listDog);
                }
            }
            if (key.equals("ducks")){
                for (Duck listDuck : list_duck) {
                    printItemListDuck(listDuck);
                }
            }
        }
//Перебираем и удаляем элементы
        list_cat.removeIf(nextCat -> nextCat.age > 2);
        list_dog.removeIf(nextDog -> nextDog.age > 2);
        list_duck.removeIf(nextDuck -> nextDuck.age > 2);

//Построение новых ArrayList и HashMap
        animals.put("cats", list_cat);
        animals.put("dogs", list_dog);
        animals.put("ducks", list_duck);
        System.out.println("\n-------------Новый HashMap-------------\n");
        for (String key : animals.keySet()) {
            System.out.println(key);
            if (key.equals("cats")) {
                for (Cat listCat : list_cat) {
                    printItemListCat(listCat);
                }
            }
            if (key.equals("dogs")) {
                for (Dog listDog : list_dog) {
                    printItemListDog(listDog);
                }
            }
            if (key.equals("ducks")) {
                for (Duck listDuck : list_duck) {
                    printItemListDuck(listDuck);
                }
            }
        }
    }

    private static void printItemListCat(Cat listCat) {
        System.out.println("\t" + listCat);
    }
    private static void printItemListDog(Dog listDog) {
        System.out.println("\t" + listDog);
    }
    private static void printItemListDuck(Duck listDuck) {
        System.out.println("\t" + listDuck);
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
