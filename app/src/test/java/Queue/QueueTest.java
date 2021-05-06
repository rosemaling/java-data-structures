package Queue;

import DataStructures.Queue.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void newQueueIsEmptyTest() {
        Queue queue = new Queue();
        boolean actual = queue.isEmpty();

        assertTrue(".isEmpty should return true on a brand-new queue", actual);
    }

    @Test
    public void canAddNewNodeTest(){
        Queue queue = new Queue();
        queue.add("I have the heart of a lion and a lifetime ban from the zoo.");
        boolean actual = queue.isEmpty();

        assertFalse(".add should add a new item to the back of the queue", actual);
    }

    @Test
    public void canPeekFrontNodeTest(){
        Queue queue = new Queue();
        queue.add("A SQL query walks into a bar and joins 2 tables.");
        String expected = "A SQL query walks into a bar and joins 2 tables.";
        String actual = (String) queue.peek();

        assertEquals(".peek should return the first item in the queue", expected, actual);
    }

    @Test
    public void peekDoesNotDeleteTest(){
        Queue queue = new Queue();
        queue.add("I have an inferiority complex, but it's not a very good one.");
        queue.peek();
        boolean actual = queue.isEmpty();

        assertFalse(".peek should not remove the peeked item from the queue", actual);
    }

    @Test
    public void removeDeletesTheFirstItemInTheQueue(){
        Queue queue = new Queue();
        queue.add("They all laughed when I said I wanted to be a comedienne -- well, they're not laughing now!");
        queue.remove();
        boolean actual = queue.isEmpty();

        assertTrue(".remove should remove the first item in the queue", actual);
    }

    @Test
    public void removeReturnsTheFirstItemInTheQueue(){
        Queue queue = new Queue();
        queue.add("A man walks into his house and is delighted when he discovers that someone has stolen all of his lamps.");
        String expected = "A man walks into his house and is delighted when he discovers that someone has stolen all of his lamps.";
        String actual = (String) queue.remove();

        assertEquals(".remove should return the first item in the queue", expected, actual);
    }


}