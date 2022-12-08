import java.util.Random;

public class MagicBox<T> {
    private T[] objects;

    public MagicBox(int countOfObjects) {
        if (countOfObjects < 1) {
            countOfObjects = 1;
        }
        objects = (T[]) new Object[countOfObjects];
    }

    public boolean add(T item) {
        boolean isAdded = false;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = item;
                isAdded = true;
                break;
            }
        }
        return isAdded;
    }

    public T pick() {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                throw new RuntimeException(String.format("Коробка не полна. Её нужно заполнить! Осталось %d незаполненных элементов.", objects.length - i));
            }
        }

        return objects[new Random().nextInt(objects.length)];
    }
}
