package com.company;

import java.io.NotActiveException;
import java.util.Arrays;
import Exception.*;

public abstract class AbstractArrayStorage implements Storage {
    protected Resume[]resumes=new Resume[10000];
    protected int size = 0;

    public int getSize() {
        return size;
    }

    public Resume get(int id) throws ExceptionUpdate {
        int index = getIndex(id);
        if(index ==-1){
            throw new ExceptionUpdate("Have no such element");

        }
        return resumes[index];


    }
    @Override
    public void clear() {
        Arrays.fill(resumes, null);
    }
    @Override
    public void update(Resume resume, int n) throws ExceptionUpdate {
        int index = getIndex(n);
        if(index != -1){
            resumes[index] = resume;
        }
        else {
            throw new ExceptionUpdate("Have no such id");
        }
    }
    public void delete(int id) {
        int index = getIndex(id);
        if(index == -1){
            throw new NotExistStorageException(id);
        }
        else{
            fillDeletedElement(index);
            resumes[size -1] = null;
            size--;
        }
    }

    protected abstract void fillDeletedElement(int index);

    public void save(Resume resume){
        int index = getIndex(resume.getId());
        if(index!=-1){
            System.out.println("Resume" + resume.getId() + "already exist");
        }
        else {
            insertElement(resume, index);
            size++;
        }
    }

    protected abstract void insertElement(Resume resume, int index);

    protected abstract int getIndex(int id);

}
