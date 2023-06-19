package com.fil.model.controller;

public class Customer {
    private String id;
    private String name;
    private String address;
    private int age;

    //create constructor with parameters
    public Customer(String id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // create getters for all fields
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }

    // create toString() method
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + '}';
    }

    public void setId(String id ) {
        this.id = id;
    }
}
