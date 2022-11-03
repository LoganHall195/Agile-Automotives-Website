package com.example.application.views.main;
import javax.validation.constraints.NotEmpty;


public class Car {

    @NotEmpty
    private String carYear = "";

    @NotEmpty
    private String Brand = "";

    @NotEmpty
    private String Model = "";

    @NotEmpty
    private String VIN = "";


    public String getCarYear() {
        return carYear;
    }
    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public String getCarModel() {
        return Model;
    }
    public void setCarModel(String model) {
        this.Model = model;
    }




    public String getVIN() {
        return VIN;
    }

    public void setVIN(String vin) {
        this.VIN = vin;
    }


    public String getCarBrand() {
        return Brand;
    }

    public void setCarBrand(String brand) {
        this.Brand = brand;
    }
}
