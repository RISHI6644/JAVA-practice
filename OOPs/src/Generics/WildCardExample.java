package Generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number> { // Here, T should either be Number or its subclasses
    private Object[] data;
    private static int default_size = 10;
    private int size = 0;

    public WildCardExample() {
        data = new Object[default_size];
    }

    public void getList(List<Number> list) { // Here you can only pass Number type
        // But if you want to pass its subclasses(i.e. int, float) as well, then do this:
        // public void getList(List<? extends Number> list)
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copying the current elements in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)data[--size];
        return removed;
    }

    public T getIndex(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildCardExample<Integer> list = new WildCardExample<>();
        // WildCardExample<String> list2 = new WildCardExample<>();

        for (int i = 0; i < 18; i++) {
            list.add(2 * i);
        }

        System.out.println(list);
    }
}
