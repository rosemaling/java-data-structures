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


}