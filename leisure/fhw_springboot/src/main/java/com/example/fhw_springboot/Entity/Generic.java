package com.example.fhw_springboot.Entity;

public class Generic<T, M> {
    private T name;
    private M age;
    public T getName() {
        return this.name;
    }

    public M getAge() {
        return age;
    }

    public void setAge(M age) {
        this.age = age;
    }

    public void setName(T name) {
        this.name = name;
    }
}
