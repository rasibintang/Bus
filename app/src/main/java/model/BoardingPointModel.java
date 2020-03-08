package model;

public class BoardingPointModel {
    String city;
    Integer location;
    String time;

    public BoardingPointModel(Integer num, String str, String str2) {
        this.location = num;
        this.city = str;
        this.time = str2;
    }

    public Integer getLocation() {
        return this.location;
    }

    public void setLocation(Integer num) {
        this.location = num;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String str) {
        this.time = str;
    }
}
