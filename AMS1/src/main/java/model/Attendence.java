package model;

public class Attendence {
    int id;
    int Class_id;
    int User_id;

    public Attendence(int id, int Class_id, int User_id) {
        this.id = id;
        this. Class_id= Class_id;
        this.User_id = User_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClass_id() {
        return Class_id;
    }

    public void setClass_id(int Class_id) {
        this.Class_id = Class_id;
    }

    public int getUserid() {
        return User_id;
    }

    public void setUserid(int User_id) {
        this.User_id = User_id;
    }
}
