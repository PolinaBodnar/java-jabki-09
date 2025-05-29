package workshop;

import java.util.Arrays;

public class ProArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    private String[] data;

    private int size;

    public ProArrayList() {
        this.data = new String[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(String element) {
        provideCapacity();
        this.data[this.size++] = element;
    }

    // TODO
    public int size() {
        return size;
    }

    // TODO
    public void add(int index, String element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Неверный индекс: " + index);
        }
        provideCapacity();

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = element;
        size++;
    }

    // TODO
    public String get(int index) {if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Неверный индекс: " + index);
    }
        return data[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(this.data).limit(this.size).toArray());
    }

    private void provideCapacity() {
        if (this.size >= this.data.length) {
            grow();
        }
    }

    private void grow() {
        int newCapacity = this.data.length * 2;
        this.data = Arrays.copyOf(this.data, newCapacity);
    }
}