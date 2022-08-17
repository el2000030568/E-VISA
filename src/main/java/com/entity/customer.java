package com.entity;

import java.io.Serializable;


public class customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String fname;
	String lname;
	String mname;
	String nation;
	String email;
	String password;
	String femail;
	String comment;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getFemail() {
		return femail;
	}
	public String setFemail(String femail) {
		this.femail = femail;
		return femail;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	} 
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//-------------------------------------------------------------
	public int age;
	public String sex;
	public String fathername;
	public String mothername;
	public String dateofbirth;
	public String placeofbirth;
	public String countryofplace;
	public String mstatus;
	public String passporttype;
	public int passportnumber;
	public String validity;
	public String status;
	
	//-----------------------------------------------------------------
	
    
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public int duration;
	public String type;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	
	public String getPlaceofbirth() {
		return placeofbirth;
	}
	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}
	public String getCountryofplace() {
		return countryofplace;
	}
	public void setCountryofplace(String countryofplace) {
		this.countryofplace = countryofplace;
	}
	public String getMstatus() {
		return mstatus;
	}
	public void setMstatus(String mstatus) {
		this.mstatus = mstatus;
	}
	public String getPassporttype() {
		return passporttype;
	}
	public void setPassporttype(String passporttype) {
		this.passporttype = passporttype;
	}
	public int getPassportnumber() {
		return passportnumber;
	}
	public void setPassportnumber(int passportnumber) {
		this.passportnumber = passportnumber;
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//-----------------------------------
	public String typevisa;
	public long accnumber;
	public int cvv;
	public double price;
	public String holdername;
	public String pstatus;
	public String getTypevisa() {
		return typevisa;
	}
	public void setTypevisa(String typevisa) {
		this.typevisa = typevisa;
	}
	public long getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(long accnumber) {
		this.accnumber = accnumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	public String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int days;
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
}