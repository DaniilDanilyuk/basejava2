package com.company;

import java.security.DrbgParameters;
import java.util.Arrays;

public class ArrayStorage extends AbstractArrayStorage{


    @Override
    protected void insertElement(Resume resume, int index) {
        resumes[size]= resume;
    }


    @Override
    protected void fillDeletedElement(int index) {
        resumes[index] = resumes[size-1];
    }




    @Override
    protected int getIndex(int id) {
        Resume searchkey = new Resume(id);
        return Arrays.binarySearch(resumes, 0, size, searchkey);
    }
}
