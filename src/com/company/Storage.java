package com.company;


public interface Storage {
    public void clear();
    public void save(Resume resume);
    public void update(Resume resume, int n) throws ExceptionUpdate;
    public void delete(int n) throws ExceptionUpdate;


}
