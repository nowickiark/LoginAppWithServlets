package com.jsp.model;

public class ToDo {

    private int id;
    private String content;

    public ToDo(){};

    public ToDo(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
