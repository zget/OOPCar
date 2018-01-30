package com.example.demo;

public class Car extends Vehicle{

    //private fields
    private String make;
    private String model;
    private long model_year;
    private String color;


    //setter methods
    public void setMake(String make){

        this.make=make;
    }

    public void setModel(String model){

      this.model=model;
    }

    public void setModel_year(long model_year) {
        this.model_year = model_year;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //getter methods

    public String getMake(){

        return make;
    }

    public String getModel() {
        return model;
    }

    public long getModel_year() {
        return model_year;
    }

    public String getColor() {
        return color;
    }

    //default constructor

    public Car(){

    }

    //overloaded constructor
     public Car(String make, String model, long model_year, String color ){

       this.make=make;
       this.model=model;
       this.model_year=model_year;
       this.color=color;
     }

     //car operation methods.

    public String start(){

        return "The "+getColor()+" "+getMake()+" "+getModel()+"  car is starting.";
    }

     public String accelerate(){

      return ("The "+getColor()+" "+getMake()+" "+getModel()+" car is acclerating.");
     }
    public String setSpeed(double speed){

        return ("The "+getColor()+" "+getMake()+" "+getModel()+" car is set to speed."+speed);
    }


    public String stop(){

       return("The "+getColor()+" "+getMake()+" "+getModel()+" car is stopped.");
    }


}
