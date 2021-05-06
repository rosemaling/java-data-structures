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
}