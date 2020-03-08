package model;

public class DropingPointModel {
    String city1;
    Integer location1;
    String time1;

    public String getCity1() {
        return this.city1;
    }

    public void setCity1(String str) {
        this.city1 = str;
    }

    public String getTime1() {
        return this.time1;
    }

    public void setTime1(String str) {
        this.time1 = str;
    }

    public Integer getLocation1() {
        return this.location1;
    }

    public void setLocation1(Integer num) {
        this.location1 = num;
    }

    public DropingPointModel(String str, String str2, Integer num) {
        this.city1 = str;
        this.time1 = str2;
        this.location1 = num;
    }
}
