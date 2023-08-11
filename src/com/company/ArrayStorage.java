package com.company;

import java.util.Arrays;

public class ArrayStorage {
    private Resume[]resumes=new Resume[10000];
    private int size = 0;

    public void clear(){
        Arrays.fill(resumes, null);
    }
    public void save(Resume resume){
        resumes[size]=resume;
        size+=1;
    }

    public void update(Resume resume, int n) throws ExceptionUpdate {
        if(n<size){
            resumes[n] = resume;
        }
        else{
            throw new ExceptionUpdate("Havent such element");
        }

    }

    public void delete(int n) throws ExceptionUpdate {
        if(n<size) {
            for (int i = n; i < size; i++) {
                resumes[i] = resumes[i + 1];
            }
            size -= 1;
            }
        else{
            throw new ExceptionUpdate("Havent such element");
            }
        }

    public Resume get(int n) throws ExceptionUpdate {
        if (n<size) {
            return resumes[n];
        }
        else {
            throw new ExceptionUpdate("Havent such element");   
        }

    }
    public void getAll(){
        for(int i=0;i<size;i++){
            System.out.println(resumes[i].toString());
        }
    }
}
