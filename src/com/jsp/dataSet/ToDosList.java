package com.jsp.dataSet;

import com.jsp.model.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDosList {

    private List<ToDo> todos = new ArrayList();

    private void addToDo(ToDo todo){
        todos.add(todo);
    }

    private List<ToDo> getToDosList (){
        return todos;
    }

}
