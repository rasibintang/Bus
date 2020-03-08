package model;

public class BookingHistoryModel {
    String rate;
    Integer star;

    public BookingHistoryModel(Integer num, String str) {
        this.star = num;
        this.rate = str;
    }

    public Integer getStar() {
        return this.star;
    }

    public void setStar(Integer num) {
        this.star = num;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String str) {
        this.rate = str;
    }
}
