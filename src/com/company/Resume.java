package com.company;

public class Resume implements Comparable<Resume>{
    private final Integer id;
    private String name;

    public Resume(){
        int x = (int) Math.random() *10;
        this.id = (Integer) x;
    }

    public Resume(int age){
        this.id  = age;
    }

    public Resume(int age, String name){
        this.id = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Name: "+ name + " | ID: " + id + " ";
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if( o == null || getClass() != o.getClass()) return false;

        Resume resume = (Resume) o;
        Integer i = id;
        return i.equals(((Resume) o).getId());
    }

    @Override
    public int compareTo(Resume o) {
        Integer i = id;
        return i.compareTo(o.id);
    }
}
