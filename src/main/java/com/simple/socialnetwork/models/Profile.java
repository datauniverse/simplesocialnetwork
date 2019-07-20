package com.simple.socialnetwork.models;

public class Profile {
    private String fullname;
    private String displayName;
    private String dateOfBirth;
    private Address address;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Profile() {
    }

    public Profile(String fullname, String displayName, String dateOfBirth, Address address) {
        this.fullname = fullname;
        this.displayName = displayName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
}
