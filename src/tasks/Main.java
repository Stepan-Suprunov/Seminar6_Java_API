package tasks;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Петров Вася", "+7 (987) 568 65 21");
        Cat cat = new Cat("Барсик", 13, true, "Линяет", owner);
        Cat cat2 = new Cat("Барсик", 13, true, "Линяет", owner);
        Cat cat3 = new Cat("Барсик", 13, true, "Линяет", owner);
        Cat cat4 = new Cat("Мурка", 13, true, "Линяет", owner);
        System.out.println(cat);
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println(cats);
    }
}
