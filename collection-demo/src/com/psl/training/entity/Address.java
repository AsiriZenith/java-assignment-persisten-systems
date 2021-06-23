package com.psl.training.entity;

public class Address {

    private int houseNo;
    private String landmark;
    private String city;

    public Address(int houseNo, String landmark, String city) {
        this.houseNo = houseNo;
        this.landmark = landmark;
        this.city = city;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", landmark='" + landmark + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
