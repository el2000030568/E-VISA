package com.model;

import java.util.List;


import javax.ejb.Remote;

import com.entity.admin;
import com.entity.customer;

@Remote

public interface adminmanager {

	public String login(admin a)throws Exception;
	public List<customer> information()throws Exception;
	public String CheckE(customer c)throws Exception;
	public String middle(String c)throws Exception;
	public String last(String c)throws Exception;
	public String mstatus(String c)throws Exception;
	public String holdername(String c)throws Exception;
	public String status(customer c)throws Exception;
	public List<customer> stampedvisa()throws Exception;
	public String CheckS(customer c)throws Exception;


}