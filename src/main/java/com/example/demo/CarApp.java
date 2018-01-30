package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarApp {



    Car myCar= new Car("Toyota", "Camry",2011,"Black");
    Car car2= new Car();



@RequestMapping("/")
    public String statusDisplay(){
    car2.setMake("Ford");
    car2.setModel("Focus");
    car2.setModel_year(2014);
    car2.setColor("Red");
             return "I am ok "+myCar.start()+ myCar.accelerate()+myCar.setSpeed(90)+myCar.stop()+car2.start()+ car2.accelerate();
    }


}
