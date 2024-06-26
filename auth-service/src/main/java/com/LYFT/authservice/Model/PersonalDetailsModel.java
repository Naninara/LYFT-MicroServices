package com.LYFT.authservice.Model;

public class PersonalDetailsModel {

    private String email;

    private String gender;

    private  String name;

    private String vehicleNumber;

    private String vehicleType;

    private  long phonenumber;

    public PersonalDetailsModel(String email, String gender, String name, String vehicleNumber, String vehicleType, long phonenumber) {
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.phonenumber = phonenumber;
    }

    public PersonalDetailsModel() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
}
