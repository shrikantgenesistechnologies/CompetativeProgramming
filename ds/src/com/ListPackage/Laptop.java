package com.ListPackage;

import java.util.Scanner;

public class Laptop implements Comparable<Laptop>{
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop {" + " brand = " + brand + ", ram = " + ram + ", price = " + price + " } ";
    }

    @Override
    public int compareTo(Laptop lap2) {
//        Scanner sc = new Scanner(System.in);
//        String val = sc.nextLine();
//        if(val.equals("price")) {
//            if(this.getPrice() > lap2.getPrice()) {
//                return 1;
//            } else {
//                return -1;
//            }
//        } else if(val.equals("ram")) {
//            if(this.getRam() > lap2.getRam()) {
//                return 1;
//            } else {
//                return -1;
//            }
//        }
//        else if(val.equals("name")) {
            return this.getBrand().compareTo(lap2.getBrand());
//        }
//        return 0;
    }
}
