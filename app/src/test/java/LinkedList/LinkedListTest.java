package LinkedList;

import DataStructures.LinkedList.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void newLinkedListIsEmptyTest() {
        LinkedList list = new LinkedList();
        boolean actual = list.isEmpty();

        assertTrue(".isEmpty should return true on a brand-new linked list", actual);
    }

    @Test
    public void linkedListWithHeadIsNotEmptyTest() {
        LinkedList list = new LinkedList();
        list.add("This is not an empty list.");
        boolean actual = list.isEmpty();

        assertFalse(".isEmpty should return false on a linked list with nodes", actual);
    }

    @Test
    public void getFirstReturnsHeadNodeTest() {
        LinkedList list = new LinkedList();
        list.add("This is not an empty list.");
        String expected = (String) new Node("This is not an empty list.").getData();
        String actual = (String) list.getFirst().getData();

        assertEquals(".getFirst should return the head node", expected, actual);
    }

    @Test
    public void getLastReturnsFinalNodeTest() {
        LinkedList list = new LinkedList();
        list.add("This is not an empty list.");
        list.add("That's right, it's still not empty.");
        String expected = (String) new Node("That's right, it's still not empty.").getData();
        String actual = (String) list.getLast().getData();

        assertEquals(".getLast should return the final node", expected, actual);
    }

    @Test
    public void getReturnsNodeAtProvidedIndex() {
        LinkedList list = new LinkedList();
        list.add("This is not an empty list.");
        list.add("That's right, it's still not empty.");
        list.add("Even now, there's stuff in it.");
        String expected = (String) new Node("That's right, it's still not empty.").getData();
        String actual = (String) list.get(1).getData();

        assertEquals(".get should return the node at the specified index", expected, actual);
    }

    @Test
    public void containsReturnsIndexOfProvidedData() {
        LinkedList list = new LinkedList();
        list.add("Logan Nelson");
        list.add("Mark Hoffman");
        list.add("Amanda Young");
        list.add("Lawrence Gordon");

        int actual = list.contains("Amanda Young");
        int expected = 2;

        assertEquals(".contains should return the index of the provided data if it exists", expected, actual);

    }

    @Test
    public void containsReturnsNegativeIfDataNotFound() {
        LinkedList list = new LinkedList();
        list.add("Logan Nelson");
        list.add("Mark Hoffman");
        list.add("Amanda Young");
        list.add("Lawrence Gordon");

        int actual = list.contains("Jill Tuck");
        int expected = -1;

        assertEquals(".contains should return -1 if the provided data is not in the list", expected, actual);
    }

    @Test
    public void deleteItemAtIndexTest() {
        LinkedList list = new LinkedList();
        list.add("Logan Nelson");
        list.add("Mark Hoffman");
        list.add("Amanda Young");
        list.add("Lawrence Gordon");
        list.delete(1);
        int expected = 3;
        int actual = list.getLength();
        assertEquals(".delete should delete the item at the index specified", expected, actual);

    }

    @Test
    public void deleteNodeWithValueTest() {
        LinkedList list = new LinkedList();
        list.add("Logan Nelson");
        list.add("Mark Hoffman");
        list.add("Amanda Young");
        list.add("Lawrence Gordon");
        list.delete("Amanda Young");
        int expected = -1;
        int actual = list.contains("Amanda Young");
        assertEquals(".delete should remove the item with the data specified", expected, actual);

    }

}