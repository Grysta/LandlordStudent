package com.grysta.crud.bean;

import java.util.Date;

public class Student {
    private Integer studentId;

    private String studentName;

    private String studentUsername;

    private String studentPassword;

    private String studentAddress;

    private String studentPhone;

    private String studentGender;

    private Date studentBirthday;

    
    
    public Student(String studentUsername) {
		super();
		this.studentUsername = studentUsername;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentId, String studentName, String studentUsername, String studentPassword,
			String studentAddress, String studentPhone, String studentGender, Date studentBirthday) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
		this.studentAddress = studentAddress;
		this.studentPhone = studentPhone;
		this.studentGender = studentGender;
		this.studentBirthday = studentBirthday;
	}

	public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentUsername() {
        return studentUsername;
    }

    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername == null ? null : studentUsername.trim();
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword == null ? null : studentPassword.trim();
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress == null ? null : studentAddress.trim();
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone == null ? null : studentPhone.trim();
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender == null ? null : studentGender.trim();
    }

    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }
    
}