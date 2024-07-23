package by.tms.lesson15_30.collections.tasks.task2;
/*
    Создать класс, который будет хранить в себе коллекцию с названиями животных.
    Реализовать методы удаления и добавления животных по следующим правилам:
- добавляется всегда в начало коллекции;
    - удаляется всегда из конца.
    Показать работу объекта этого класса в main методе другого класса
*/
public class DirectorZoo {
    public static void main(String[] args) {
        AnimalList zoo = new AnimalList("жираф");
        zoo.add("верблюд");
        zoo.add("слон");
        zoo.add("мышь");
        zoo.add("пингвин");
        System.out.println("В зоопарке числятся:");
        for (int i = 0; i < zoo.animals.size(); i++) {
            System.out.println(zoo.animals.get(i));
        }
        System.out.println();
        zoo.remove("мышь");

        System.out.println("В зоопарке числятся:");
        for (String animal : zoo.animals) {
            System.out.println(animal);
        }
    }
}
