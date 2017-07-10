package oop.model.utilities.ds;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by mayukh42 on 5/6/17.
 */
public class TestArrayQueue {

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

    @Test
    public void testEnqueueAll() {
        createQueue(numbers);
        System.out.println(queue);
        assertEquals("Queue should be full after adding at least 4 elements", 4, queue.getSize());
    }

    @Test
    public void testDequeueAll() {
        createQueue(numbers);
        int i = 4;
        while (i > 0) {
            Integer n = queue.poll();
            System.out.println(n);
            i--;
        }
        assertEquals("Queue should be empty after removing at least 4 elements", 0, queue.getSize());
    }

    @Test
    public void testEmptyQueuePoll() {
        queue = new ArrayQueue<>();
        Integer n = queue.poll();
        assertTrue("Polling an empty queue should return null", n == null);
    }

    @Test
    public void testEnqAndDeq() {
        queue = new ArrayQueue<>();

        queue.offer(2);
        queue.offer(3);
        System.out.println(queue + ", size = " + queue.getSize());  // [2, 3]
        assertEquals("Queue should have 2 elements after adding 2", 2, queue.getSize());

        Integer n = queue.poll();
        System.out.println(n + " removed, " + queue + ", size = " + queue.getSize());   // 2 removed, [3]
        assertEquals("Queue should have 1 element after adding 2 and removing 1",
                1, queue.getSize());

        queue.offer(5);     // [3, 5]
        queue.offer(7);     // [3, 5, 7]
        queue.offer(11);    // [3, 5, 7, 11]
        System.out.println(queue + ", size = " + queue.getSize());  // [3, 5, 7, 11]
        assertEquals("Queue should have 4 elements after adding 2, removing 1, and adding 3 more",
                4, queue.getSize());

        n = queue.poll();
        n = queue.poll();
        System.out.println(n + " removed, " + queue + ", size = " + queue.getSize());   // 5 removed, [7, 11]
        assertEquals("Queue should have 2 elements after adding 2, removing 1, adding 3, and removing 2",
                2, queue.getSize());

        queue.offer(13);    // [7, 11, 13]
        System.out.println(queue + ", size = " + queue.getSize());
        assertEquals(
                "Queue should have 3 elements after adding 2, removing 1, adding 3, removing 2, and adding 1",
                3, queue.getSize());
    }

    @Test
    public void testIterable() {
        createQueue(numbers);
        while (queue.hasNext())
            System.out.println(queue.next());
    }
}
