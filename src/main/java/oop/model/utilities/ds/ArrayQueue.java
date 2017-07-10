package oop.model.utilities.ds;

/**
 * Created by mayukh42 on 5/6/17.
 *
 * FIFO Queue based on an array
 */
public class ArrayQueue<T> implements IterableCollection<T> {

    private static final int MAX_SIZE = 4;

    private T[] elements;
    private int head;
    private int last;
    private int size;
    private int itIndex;    // should always be updated when head is updated
    private int itLeft;    // should always be updated when size is updated

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        this.elements = (T[]) new Object[MAX_SIZE];
        head = 0;
        last = 0;
        size = 0;
        itIndex = head;
        itLeft = size;
    }

    @SuppressWarnings("unchecked")
    public ArrayQueue(int size) {
        if (size < 0) throw new IllegalArgumentException("Queue size cannot be negative");
        this.elements = (T[]) new Object[size];
        head = 0;
        last = 0;
        this.size = 0;
        itIndex = head;
        itLeft = this.size;
    }

    public boolean offer(T element) {
        if (size < MAX_SIZE) {
            elements[last++] = element;
            size++;
            if (last == MAX_SIZE) last = last % MAX_SIZE;

            itLeft = size;
            return true;
        }
        else return false;
    }

    public T poll() {
        if (size == 0) return null;

        T element = elements[head];
        elements[head] = null;
        size--;
        head++;
        if (head == MAX_SIZE) head = head % MAX_SIZE;

        itIndex = head;
        itLeft = size;
        return element;
    }

    @Override
    public boolean hasNext() {
        return itLeft > 0;
    }

    @Override
    public T next() {
        T element = elements[itIndex++];
        if (itIndex == MAX_SIZE) itIndex = itIndex % MAX_SIZE;
        itLeft--;
        return element;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayQueue[");

        /* alternate logic to iterator indices */
        int end = head < last ? last : last + MAX_SIZE;
        for (int i = head; i < end && elements[i % MAX_SIZE] != null; i++)
            sb.append(elements[i % MAX_SIZE]).append(", ");

        sb.append("]");
        return sb.toString();
    }
}
