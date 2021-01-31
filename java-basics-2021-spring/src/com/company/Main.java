package com.company;

import java.util.ArrayList;

public class Main {
    // primate type: int float double string boolean short
    // pass by value的意思就是 如果是primitive type就copy 值 如果是reference type就copy 指向它的reference
    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();

        Car car = new Car();

        IceCar car1 = new IceCar();
        Evcar evCar = new Evcar();


        Bike bike = new Bike();
        fleet.add(car);
        fleet.add(bike);


        int sum = 0;
        for (Vehicle vehicle:fleet){
            sum+= vehicle.getPrice();
        }

        car1.filGas();
        car1.changeOil();

        List<Chargable> chargable = new ArrayList<>();
        //Laptop laptop = new laptop();
        Cellphone cellphone = new Cellphone();

        chargable.add(laptop);
        chargable.add(cellphone);
        chargable.add(evCar);
        EvCar.charge();


        // write your code here
//        Sudent eddy = new Student();
//        Sudent MIKE = new Student();
//        updateInfo(eddy);
//        System.out.println("The value of c is " + c);
//        public static boid updateInfo(Student student){
//        student.grade = '8';
//    }

        //foreach

//        for(int i =0; i<100;i++){
//            System.out.println("The value fo i is" + i);
//        }


//        while (j <100);
//        System.out.println("The value of j is" + j);
//        j++;




//        int x = 100;
//        int y = 1;
//        int c =myAdd(x,y);
//        System.out.println("The value of c is " + c);


//    public static int myAdd(int a,int b){
//        a =1000;
//        return a+b;

}

}
