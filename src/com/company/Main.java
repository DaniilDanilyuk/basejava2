package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ExceptionUpdate {
        ArrayStorage arrayStorage = new ArrayStorage();
        arrayStorage.save(new Resume(1,"Dan"));
        arrayStorage.save(new Resume(2,"Bob"));
        arrayStorage.save(new Resume(3,"Bolen"));



        SortedArrayStorage sortedArrayStorage = new SortedArrayStorage();
        sortedArrayStorage.save(new Resume(1));
        sortedArrayStorage.save(new Resume(2));
        sortedArrayStorage.save(new Resume(3));
        System.out.println(new Resume(2).equals(new Resume(1)));
        System.out.println(Arrays.binarySearch(sortedArrayStorage.resumes,0, sortedArrayStorage.getSize(),  new Resume(3)));
        System.out.println(sortedArrayStorage.get(2));
    }   


}
