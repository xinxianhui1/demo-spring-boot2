package com.offcn.pojo;

public class User{

    private String _id;
    private String ucode;
    private String uname;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "User{" +
                "_id='" + _id + '\'' +
                ", ucode='" + ucode + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}