package com.company;

import java.util.Arrays;

public class SortedArrayStorage extends AbstractArrayStorage{



    @Override
    protected void insertElement(Resume resume, int index) {
        int insertIdx = -index - 1;
        System.arraycopy(resumes,insertIdx,resumes,insertIdx + 1, size- insertIdx);
        resumes[insertIdx] = resume;

    }

    @Override
    protected void fillDeletedElement(int index) {
        int numMoved = size - index - 1;
        if(numMoved > 0){
            System.arraycopy(resumes,index + 1, resumes, index, numMoved);
        }
    }

    @Override
    public int getIndex(int id) {
        Resume searchkey = new Resume(id);
        return Arrays.binarySearch(resumes, 0, size, searchkey);
    }
}
