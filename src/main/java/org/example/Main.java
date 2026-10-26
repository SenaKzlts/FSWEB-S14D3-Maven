package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;
import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pacific Car Company Test ===");
        
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("\n=== Car R&D Company Test ===");

        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "A gas-powered car", 15.5, 6);
        System.out.println("Class: " + gasCar.getClass().getSimpleName());
        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());

        CarSkeleton electricCar = new ElectricCar("Electric Car", "An electric car", 300.0, 75);
        System.out.println("Class: " + electricCar.getClass().getSimpleName());
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());

        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "A hybrid car", 20.0, 50, 4);
        System.out.println("Class: " + hybridCar.getClass().getSimpleName());
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
    }
}