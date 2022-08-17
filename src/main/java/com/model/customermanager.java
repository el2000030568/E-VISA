package com.model;

import java.util.List;


import javax.ejb.Remote;

import com.entity.customer;

@Remote
public interface customermanager {
    public String save(customer c) throws Exception;
    public List<customer> read() throws Exception;
    public String login(customer c) throws Exception;
    public String ufirstname(String c) throws Exception;
    public String umiddlename(String c) throws Exception;
    public String ulastname(String c) throws Exception;
    public String uemail(String c) throws Exception;
    public String userSave(customer c) throws Exception;
    public String payment(customer c) throws Exception;
    public String tocheck(String c)throws Exception;
    public String yappiled(String name)throws Exception;
    public int days(String Name)throws Exception;
    public String status(String Name)throws Exception;
    public String comment(String Name)throws Exception;
    //-------------------------------------------
    public String applyb(customer c)throws Exception;
    //-------------------------------------status of apply-b
    public String ayappiled(String name)throws Exception;
    public int adays(String Name)throws Exception;
    public String astatus(String Name)throws Exception;
    public String acomment(String Name)throws Exception;
    
    
    //-------------------------------checkings validate
    public String tocheck2(String c)throws Exception;
    public String tocheck3(String c)throws Exception;
    public String toapplyb(String c)throws Exception;
    
    
}