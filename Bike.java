package com;

class Vehicle2{
    String colour;
    private int number;
    void set(int number)
    {
        number=number;
    }
    int get()
    {
        return number;
    }
}

class Bike extends Vehicle2{
    public static void main(String[] args) {
        Vehicle2 v = new Vehicle2();
        v.colour = "white";
        v.set(1010) ;
        System.out.println(v.colour + " " + v.get());
    }
}
