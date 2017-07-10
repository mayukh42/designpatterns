package oop.patterns.gof;

import oop.model.utilities.ds.ArrayQueue;
import oop.model.utilities.ds.IterableCollection;

/**
 * Created by mayukh42 on 5/6/17.
 *
 * The Iterator design pattern
 *
 * Implement an iterable interface that iterates through the elements of a collection in the order specific to the
 *  collection. For example, in a FIFO queue, the first element returned by iterator should be the same one added first,
 *  and last element should be the one added last. Similarly, in a TreeSet the first element should be the
 *  lexicographically smallest element in the order maintained by TreeSet elements' comparator.
 */
public class Iterator {

    private final Integer[] numbers = new Integer[]{2,3,5,7,11,13,17};
    private ArrayQueue<Integer> queue;

    /* candiate for @Before */
    private void createQueue(Integer[] numbers) {
        queue = new ArrayQueue<>();
        boolean added = false;
        for (Integer n : numbers) {
            added = queue.offer(n);
            if (!added) break;
        }
    }

    public void testIterator() {
        createQueue(numbers);
        IterableCollection iterable = queue;
        while (iterable.hasNext())
            System.out.println(iterable.next());
    }
}
