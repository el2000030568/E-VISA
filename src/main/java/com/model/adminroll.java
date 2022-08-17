package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.entity.admin;
import com.entity.customer;

@Stateless
public class adminroll implements adminmanager {
   
	String url = "jdbc:mysql://localhost:3306/project";
	String user = "root";
	String password = "Support123";
	Connection con = null;
	PreparedStatement ps = null;
	@Override
	public String login(admin a) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  admin where username = ? and password = ?");
		ps.setString(1,a.getUsername());
		ps.setString(2, a.getPassword());
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())  
		{   
			return "sucessfully logined !";
		}
		con.close();
		return null;
	}


	@Override
	public List<customer> information() throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  apply");
		ResultSet rs = ps.executeQuery();
		List<customer> l = new ArrayList<customer>();
		while(rs.next()) {
			customer c = new customer();
			c.setFname(rs.getString("firstname"));
			c.setMname(rs.getString("middlename"));
			c.setLname(rs.getString("lastname"));
			c.setAge(rs.getInt("age"));
			c.setSex(rs.getString("sex"));
			c.setFathername(rs.getString("fathername"));
			c.setMothername(rs.getString("mothername"));
			c.setDateofbirth(rs.getString("dateofbirth"));
			c.setCountryofplace(rs.getString("placeofbirth"));
			c.setMstatus(rs.getString("mstatus"));
			c.setTypevisa(rs.getString("typepassport"));
			c.setPassportnumber(rs.getInt("passportnumber"));
			c.setValidity(rs.getString("validity"));
			c.setDays(rs.getInt("dstaydays"));
			c.setType(rs.getString("type"));
			l.add(c);
			
		}
		con.close();
		return l;
	}


	@Override
	public String CheckE(customer c) throws Exception {
		// TODO Auto-generated method stub
		con=DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  apply where firstname = ?");
		ps.setString(1,c.getFname());
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			return rs.getString(1);
		}
		return null;
	}


	@Override
	public String middle(String c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  evisa where email = ?");
		ps.setString(1,c);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())  
		{   
			return rs.getString(2);
		}
		con.close();
		return null;
		
	}


	@Override
	public String last(String c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  evisa where email = ?");
		ps.setString(1,c);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())  
		{   
			return rs.getString(3);
		}
		con.close();
		return null;
	}


	@Override
	public String mstatus(String c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  payment where firstname = ?");
		ps.setString(1,c);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())  
		{   
			return rs.getString("status");
		}
		con.close();
		return null;
	}


	@Override
	public String holdername(String c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  payment where firstname = ?");
		ps.setString(1,c);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())  
		{   
			return rs.getString("hodername");
		}
		con.close();
		return null;
	}


	@Override
	public String status(customer c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("UPDATE status set status=? , comment =? where firstname = ?");
		ps.setString(1,c.getStatus());
		ps.setString(2,c.getComment());
		ps.setString(3,c.getFname());
		double ex = ps.executeUpdate();
		
		if(ex != 0)
		{   
			return "Succesully aproved";
		}
		con.close();
		return null;
	}


	@Override
	public List<customer> stampedvisa() throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  applyb");
		ResultSet rs = ps.executeQuery();
		List<customer> l = new ArrayList<customer>();
		while(rs.next()) {
			customer c = new customer();
			c.setFname(rs.getString("firstname"));
			c.setMname(rs.getString("middlename"));
			c.setLname(rs.getString("lastname"));
			c.setDate(rs.getString("date"));
			c.setType(rs.getString("type"));
			l.add(c);
			
		}
		con.close();
		return l;

	}


	@Override
	public String CheckS(customer c) throws Exception {
		con=DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  applyb where firstname = ?");
		ps.setString(1,c.getFname());
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			return rs.getString(1);
		}
		return null;
	}

    

      
	

	
	
}
