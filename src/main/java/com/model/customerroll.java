package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.entity.customer;

@Stateless
public class customerroll implements customermanager{
    
	String url = "jdbc:mysql://localhost:3306/project";
	String user = "root";
	String password = "Support123";
	Connection con = null;
	PreparedStatement ps = null;
	@Override
	public String save(customer c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("insert into evisa values(?,?,?,?,?,?)");
		ps.setString(1,c.getFname());
		ps.setString(2,c.getMname());
		ps.setString(3,c.getLname());
		ps.setString(4,c.getNation());
		ps.setString(5,c.getEmail());
		ps.setString(6,c.getPassword());
	    ps.execute();
		con.close();
		return "successfully register";
	}
	@Override
	public List<customer> read() throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("select * from evisa where email = ?");
		ResultSet rs = ps.executeQuery();
		List<customer> L = new ArrayList<customer>();
		while(rs.next()) {
			customer c = new customer();
			c.setFname(rs.getString(1));
			c.setMname(rs.getString(2));
			c.setLname(rs.getString(3));
			c.setNation(rs.getString(4));
			c.setEmail(rs.getString(5));
			c.setPassword(rs.getString(6));
			L.add(c);
		}
		con.close();
		return L;
	}
	@Override
	public String login(customer c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  evisa where email = ? and password = ?");
		ps.setString(1,c.getEmail());
		ps.setString(2, c.getPassword());
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())  
		{   
			return c.getEmail();
		}
		con.close();
		return null;
	}
	@Override
	public String ufirstname(String c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  evisa where email = ?");
		ps.setString(1,c);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())  
		{   
			return rs.getString(1);
		}
		con.close();
		return null;
	}
	@Override
	public String umiddlename(String c) throws Exception {
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
	public String ulastname(String c) throws Exception {
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
	public String uemail(String c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  evisa where email = ?");
		ps.setString(1,c);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())   
		{   
			return rs.getString("email");
		}	
		con.close();
		return null;
	}
	@Override
	public String userSave(customer c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("insert into apply values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,c.getFname());
		ps.setString(2,c.getMname());
		ps.setString(3,c.getLname());
		ps.setInt(4,c.getAge());
		ps.setString(5, c.getSex());
		ps.setString(6,c.getFathername());
		ps.setString(7,c.getMothername());
		ps.setString(8,c.getDateofbirth());
		ps.setString(9,c.getPlaceofbirth());
		ps.setString(10,c.getCountryofplace());
		ps.setString(11,c.getMstatus());
		ps.setString(12,c.getPassporttype());
		ps.setInt(13,c.getPassportnumber());
		ps.setString(14, c.getValidity());
		ps.setInt(15, c.getDuration());
		ps.setString(16,c.getType());
		ps.setString(17,"no");
		ps.execute();
		con.close();
		return "sucessfully  appiled";
	}
	@Override
	public String payment(customer c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("insert into payment values(?,?,?,?,?,?,?,?)");
		ps.setString(1,c.getFname());
		ps.setString(2,c.getTypevisa());
		ps.setLong(3,c.getAccnumber());
		ps.setString(4,c.getValidity());
		ps.setInt(5,c.getCvv());
		ps.setDouble(6,c.getPrice());
		ps.setString(7,c.getHoldername()) ;
	    ps.setString(8,c.getPstatus());
	    ps.execute();
	    con.close();
		return "check ur status";
	}
	@Override
	public String tocheck(String c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("insert into status values(?,?,?)");
		ps.setString(1,c);
		ps.setString(2,"no");
		ps.setString(3,"your application on process");
		ps.execute();
		con.close();	
		return "entered to database";
	}
	@Override
	public String yappiled(String name) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  payment where firstname = ?");
		ps.setString(1,name);
        ResultSet rs = ps.executeQuery();
		
		while(rs.next())   
		{   
			return rs.getString("typevisa");
		}	
		con.close();
		return null;
	}
	@Override
	public int days(String Name) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  apply where firstname = ?");
		ps.setString(1,Name);
        ResultSet rs = ps.executeQuery();
		
		while(rs.next())   
		{   
			return rs.getInt("dstaydays");
		}	
		con.close();
		return 0;
	}
	@Override
	public String status(String Name) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  status where firstname = ?");
		ps.setString(1,Name);
        ResultSet rs = ps.executeQuery();
		
		while(rs.next())   
		{   
			return rs.getString("status");
		}	
		con.close();
		return null;
	}
	@Override
	public String comment(String Name) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  status where firstname = ?");
		ps.setString(1,Name);
        ResultSet rs = ps.executeQuery();
		
		while(rs.next())   
		{   
			return rs.getString("comment");
		}	
		con.close();
		return null;
	}
	@Override
	public String applyb(customer c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("insert into applyb values(?,?,?,?,?,?,?)");
		ps.setString(1,c.getFname());
		ps.setString(2,c.getMname());
		ps.setString(3,c.getLname());
		ps.setString(4,c.getDate());
		ps.setString(5,c.getType());
		ps.setInt(6,c.getDays());
		ps.setString(7,"checking dates");
		ps.execute();
		con.close();
		return "appiled succesfull";
	}
	@Override
	public String ayappiled(String name) throws Exception {
		
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  payment where firstname = ?");
		ps.setString(1,name);
        ResultSet rs = ps.executeQuery();
		
		while(rs.next())   
		{   
			return rs.getString("typevisa");
		}	
		con.close();
		return null;
	}
	@Override
	public int adays(String Name) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  applyb where firstname = ?");
		ps.setString(1,Name);
        ResultSet rs = ps.executeQuery();
		
		while(rs.next())   
		{   
			return rs.getInt("days");
		}	
		con.close();
		return 0;
	}
	@Override
	public String astatus(String Name) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  status where firstname = ?");
		ps.setString(1,Name);
        ResultSet rs = ps.executeQuery();
		
		while(rs.next())   
		{   
			return rs.getString("status");
		}	
		con.close();
		return null;

	}
	@Override
	public String acomment(String Name) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  status where firstname = ?");
		ps.setString(1,Name);
        ResultSet rs = ps.executeQuery();
		
		while(rs.next())   
		{   
			return rs.getString("comment");
		}	
		con.close();
		return null;
	}
	public String tocheck2(String c)throws Exception{
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  applyb where firstname = ?");
		ps.setString(1,c);
		 ResultSet rs = ps.executeQuery();
			
			while(rs.next())   
			{   
				return "done";
			}	
		
		return null;
		
		
	}
	public String tocheck3(String c)throws Exception{
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  apply where firstname = ?");
		ps.setString(1,c);
		 ResultSet rs = ps.executeQuery();
			
			while(rs.next())   
			{   
				return "done";
			}	
		
		return null;
		
		
	}
	public String toapplyb(String c) throws Exception {
		con = DriverManager.getConnection(url,user,password);
		ps = con.prepareStatement("Select * from  applyb where firstname = ?");
		ps.setString(1,c);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())  
		{   
			return "done";
		}
		con.close();
		return null;
	}

}