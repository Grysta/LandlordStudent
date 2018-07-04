package com.grysta.crud.bean;

public class Landlord {
    private Integer landlordId;

    private String landlordName;

    private String landlordUsername;

    private String landlordPassword;

    private String landlordAddress;

    private String landlordPhone;

    public Landlord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Landlord(Integer landlordId, String landlordName, String landlordUsername, String landlordPassword,
			String landlordAddress, String landlordPhone) {
		super();
		this.landlordId = landlordId;
		this.landlordName = landlordName;
		this.landlordUsername = landlordUsername;
		this.landlordPassword = landlordPassword;
		this.landlordAddress = landlordAddress;
		this.landlordPhone = landlordPhone;
	}

	public Integer getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Integer landlordId) {
        this.landlordId = landlordId;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName == null ? null : landlordName.trim();
    }

    public String getLandlordUsername() {
        return landlordUsername;
    }

    public void setLandlordUsername(String landlordUsername) {
        this.landlordUsername = landlordUsername == null ? null : landlordUsername.trim();
    }

    public String getLandlordPassword() {
        return landlordPassword;
    }

    public void setLandlordPassword(String landlordPassword) {
        this.landlordPassword = landlordPassword == null ? null : landlordPassword.trim();
    }

    public String getLandlordAddress() {
        return landlordAddress;
    }

    public void setLandlordAddress(String landlordAddress) {
        this.landlordAddress = landlordAddress == null ? null : landlordAddress.trim();
    }

    public String getLandlordPhone() {
        return landlordPhone;
    }

    public void setLandlordPhone(String landlordPhone) {
        this.landlordPhone = landlordPhone == null ? null : landlordPhone.trim();
    }
}