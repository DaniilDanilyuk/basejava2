package com.company;

public class Main {
    public static void main(String[] args) throws ExceptionUpdate {
        ArrayStorage arrayStorage = new ArrayStorage();
        arrayStorage.save(new Resume(1,"Dan"));
        arrayStorage.save(new Resume(2,"Bob"));
        arrayStorage.save(new Resume(3,"Bolen"));

        System.out.println(arrayStorage.getName("Bob"));
        
    }   


}
