package Stack;

import DataStructures.Stack.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void newStackIsEmptyTest() {
        Stack stack = new Stack();
        boolean actual = stack.isEmpty();

        assertTrue(".isEmpty should return true on a brand-new stack", actual);
    }

    @Test
    public void canPushNewNodeTest(){
        Stack stack = new Stack();
        stack.push("I have the heart of a lion and a lifetime ban from the zoo.");
        boolean actual = stack.isEmpty();

        assertFalse(".push should add a new item to the top of the stack", actual);
    }

    @Test
    public void canPeekFirstNode(){
        Stack stack = new Stack();
        stack.push("A SQL query walks into a bar and joins 2 tables.");
        String expected = "A SQL query walks into a bar and joins 2 tables.";
        String actual = (String) stack.peek();

        assertEquals(".peek should return the first item in the stack", expected, actual);
    }

    @Test
    public void peekDoesNotDeleteTest(){
        Stack stack = new Stack();
        stack.push("I have an inferiority complex, but it's not a very good one.");
        stack.peek();
        boolean actual = stack.isEmpty();

        assertFalse(".peek should not remove the peeked first item from the stack", actual);
    }

    @Test
    public void removeDeletesTheFirstItemInTheStack(){
        Stack stack = new Stack();
        stack.push("They all laughed when I said I wanted to be a comedienne -- well, they're not laughing now!");
        stack.pop();
        boolean actual = stack.isEmpty();

        assertTrue(".pop should remove the first item in the stack", actual);
    }

    @Test
    public void removeReturnsTheFirstItemInTheStack(){
        Stack stack = new Stack();
        stack.push("A man walks into his house and is delighted when he discovers that someone has stolen all of his lamps.");
        String expected = "A man walks into his house and is delighted when he discovers that someone has stolen all of his lamps.";
        String actual = (String) stack.pop();

        assertEquals(".pop should return the first item in the stack", expected, actual);
    }


}