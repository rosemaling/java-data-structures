package Stack;

import DataStructures.Stack.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void nodeHasDataTest() {
        Node node = new Node("It's hard to explain puns to kleptomaniacs because they always take things literally.");
        String expected = "It's hard to explain puns to kleptomaniacs because they always take things literally.";
        String actual = (String) node.getData();

        assertEquals("A node should hold data given at time of creation", expected, actual);
    }
}