package model;

public class Class {
    int id;
    String Classname;

    public Class(int id, String Classname) {
        this.id = id;
        this.Classname = Classname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return Classname;
    }

    public void setClassname(String Classname) {
        this.Classname = Classname;
    }
}
