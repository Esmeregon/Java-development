
package Task5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Cat> list_cat = new ArrayList<>();
        List<Dog> list_dog = new ArrayList<>();
        List<Duck> list_duck = new ArrayList<>();
        list_cat.add(new Cat("Behemoth", 5, "Black"));
        list_cat.add(new Cat("Tom", 7, "Grey"));
        list_cat.add(new Cat("Garfield", 2, "Ginger"));
        list_dog.add(new Dog("Lassy", 13, "White"));
        list_dog.add(new Dog("Lady", 2, "Brown"));
        list_dog.add(new Dog("Jake", 6, "Yellow"));
        list_duck.add(new Duck("Huey", 1, "male"));
        list_duck.add(new Duck("Dewey", 2, "male"));
        list_duck.add(new Duck("Louie", 3, "male"));
        HashMap<String, List> animals = new HashMap<>();
        animals.put("cats", list_cat);
        animals.put("dogs", list_dog);
        animals.put("ducks", list_duck);

        printItem(animals);

//Перебираем и удаляем элементы
        list_cat.removeIf(nextCat -> nextCat.age > 2);
        list_dog.removeIf(nextDog -> nextDog.age > 2);
        list_duck.removeIf(nextDuck -> nextDuck.age > 2);

//Построение новых ArrayList и HashMap
        System.out.println("\n-------------Новый HashMap-------------\n");
        printItem(animals);
    }

    private static void printItem(HashMap<String, List> animals) {

        for (Map.Entry<String, List> entry : animals.entrySet()) {
            System.out.println(entry.getKey());
            for(Object i:entry.getValue()){
                System.out.println("\t" + i);
            }
        }
    }
}

