package by.tms.lesson15_30.collections.tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    private String name;
    List<String> animals = new ArrayList<>();

    public AnimalList(String name) {
        this.name = name;
        this.add(name);
    }

    public boolean add(String name) {
        animals.add(name);
        for (int i = animals.size() - 1; i > 0; i--) {
            animals.set(i, animals.get(i - 1));
        }
        animals.set(0, name);
        return true;
    }

    public boolean remove(String name) {
        animals.remove(name);
        return true;
    }


}
