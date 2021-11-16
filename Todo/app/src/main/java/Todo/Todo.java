package Todo;

import java.util.ArrayList;

public class Todo {
    ArrayList<String> toDos ;

    public ArrayList<String> listToDos() {
        return toDos;
    }
    public void addToDos(String toDo){
        toDos.add(toDo);
    }

    public double one(){
        return 1.0;
    }

}
