package LinkedList;

import DataStructures.LinkedList.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void testNodeHasData() {
        Node testNode = new Node("This is my data. There are many like it, but this one is mine.");
        String expected = "This is my data. There are many like it, but this one is mine.";
        String actual = (String) testNode.getData();
        assertEquals("Node should be able to store data in its data field", expected, actual);
    }
}
