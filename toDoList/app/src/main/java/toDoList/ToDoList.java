package toDoList;

import java.util.ArrayList;

public class ToDoList {
    ArrayList<String> toDos = new ArrayList<String>();

    public ArrayList<String> listToDos() {
        return toDos;
    }
    public void addToDos(String toDo){
        toDos.add(toDo);
    }

}
