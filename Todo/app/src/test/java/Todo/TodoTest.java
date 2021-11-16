package Todo;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TodoTest {
    @Test public void toDoTest() {
        Todo list = new Todo();
        ArrayList<String> comparator = new ArrayList<String>();
        comparator.add("Learn");
        comparator.add("Java");
        list.addToDos("Learn");
        assertEquals(1.0,list.one(),0);
    }
}
