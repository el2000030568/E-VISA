package com.controller;

import java.util.List;

import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;

import com.entity.admin;
import com.entity.customer;
import com.model.adminmanager;

@ManagedBean(name = "admin" , eager = true)
public class adminmanage {

	public String username;
	public String password;
	public String res;
	@EJB(lookup = "java:global/datatable/adminroll!com.model.adminmanager")
	
	adminmanager am;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	
	public String loginA() {
		try {
			admin a = new admin();
			a.setUsername(username);
			a.setPassword(password);
			res = am.login(a);
			if(res!= null) {
				return "Achoose.xhtml";
			}
			return null;
		}
		catch(Exception e) {
			res = e.getMessage();
		}
		return null;
	}
	
	
	//-----------------------------Electronic Visa 
	List<customer> L;
	public List<customer> getL() {
		
		try {
		      L = am.information();	
		}
		catch(Exception e) {
			res = e.getMessage();
		}
		return L;
	}
	public void setL(List<customer> l) {
		L = l;
	}
	
	
	//---------------------------------
	public static String firstname;
	
	public  String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		adminmanage.firstname = firstname;
	}
	
	//---------------------------------
   public static  String mstatus;
   public static  String holdername;
   public String status;
   public String comment;
public String getMstatus() {
	return mstatus;
}
public void setMstatus(String mstatus) {
	this.mstatus = mstatus;
}
public String getHoldername() {
	return holdername;
}
public void setHoldername(String holdername) {
	this.holdername = holdername;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String CheckE() {
	try {
		customer c=new customer();
		c.setFname(firstname);
		res = am.CheckE(c);
		String p = am.mstatus(firstname);
		String p1 = am.holdername(firstname);
		
		if(res!=null ) {
			setMstatus(p);
			setHoldername(p1);
			return "adminchoose1.jsf";
			}
		return res = "invalid firstname";			
	}
	catch(Exception e) {
		res=e.getMessage();
		
	}
	return null;
}
public String approved() {
	try {
	customer c=new customer();
	c.setFname(firstname);
	c.setStatus(status);
	c.setComment(comment);
	res = am.status(c);
	return "adminapproved.jsf";
	}
	catch(Exception e) {
		res = e.getMessage();
	}
	return null;
}
//--------------------------
List<customer> sv;
public List<customer> getSv() {
	try {
		sv = am.stampedvisa();
	}
	catch(Exception e) {
		res = e.getMessage();
	}
	return sv;
}
public void setSv(List<customer> sv) {
	this.sv = sv;
}
public String CheckS() {
	try {
		customer c=new customer();
		c.setFname(firstname);
		res = am.CheckS(c);
		String p = am.mstatus(firstname);
		String p1 = am.holdername(firstname);
		
		if(res!=null ) {
			setMstatus(p);
			setHoldername(p1);
			return "adminchoose1.jsf";
			}
		return res = "invalid firstname";			
	}
	catch(Exception e) {
		res=e.getMessage();
		
	}
	return null;
}


}
