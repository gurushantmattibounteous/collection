public class MyArrayList<T> {

    private Object[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Add element
    public void add(T element) {
        if (size == data.length) {
            resize();
        }
        data[size] = element;
        size++;
    }

    // Get element
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    // Remove element
    public void remove(int index) {
        checkIndex(index);

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null; // avoid memory leak
        size--;
    }

    // Current size
    public int size() {
        return size;
    }

    // Resize logic (grow by 50%)
    private void resize() {
        int newCapacity = data.length + (data.length / 2);
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < data.length; i++) {
            newArray[i] = data[i];
        }

        data = newArray;
    }

    // Index validation
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }
}