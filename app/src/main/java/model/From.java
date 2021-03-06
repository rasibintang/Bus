package model;

import fathorazi.id.ac.unuja.bus.BuildConfig;

public class From {
    private String firstName = BuildConfig.FLAVOR;

    private int id = 0;
    private String lastName = BuildConfig.FLAVOR;
    private int profilePic = -1;

    public From(String str, String str2, int i, int i2) {
        this.firstName = str;
        this.lastName = str2;
        this.id = i;
        this.profilePic = i2;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getProfilePic() {
        return this.profilePic;
    }

    public void setProfilePic(int i) {
        this.profilePic = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.firstName);
        sb.append(" ");
        sb.append(this.lastName);
        return sb.toString();
    }
}
