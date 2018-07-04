package com.grysta.crud.bean;

import java.util.Date;

public class MeetingDate {
    private Integer dateId;

    private Integer dateLandlordId;

    private Integer dateStudentId;

    private Date dateDate;

    private String dateAddress;

    public Integer getDateId() {
        return dateId;
    }

    public void setDateId(Integer dateId) {
        this.dateId = dateId;
    }

    public Integer getDateLandlordId() {
        return dateLandlordId;
    }

    public void setDateLandlordId(Integer dateLandlordId) {
        this.dateLandlordId = dateLandlordId;
    }

    public Integer getDateStudentId() {
        return dateStudentId;
    }

    public void setDateStudentId(Integer dateStudentId) {
        this.dateStudentId = dateStudentId;
    }

    public Date getDateDate() {
        return dateDate;
    }

    public void setDateDate(Date dateDate) {
        this.dateDate = dateDate;
    }

    public String getDateAddress() {
        return dateAddress;
    }

    public void setDateAddress(String dateAddress) {
        this.dateAddress = dateAddress == null ? null : dateAddress.trim();
    }
}