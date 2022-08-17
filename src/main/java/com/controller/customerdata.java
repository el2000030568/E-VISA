package com.controller;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.*;
import com.entity.customer;
import com.model.customermanager;

@ManagedBean(name="cus",eager=true)
public class customerdata<RequestDispatcher> {
	String fname;
	String lname;
	String mname;
	String nation;
	String email;
	String password;  
   public  String res;
   public static double prize;
   public String t;
   
   
   public String getT() {
	return t;
}





public void setT(String t) {
	this.t = t;
}





public  double getPrize() {
	return prize;
}





public  void setPrize(double prize) {
	customerdata.prize = prize;
}
public static String headername;
    List<customer> L;
    public  String getHeadername() {
		return headername;
	}





	public  void setHeadername(String headername) {
		customerdata.headername = headername;
	}
	public static String result;
    
    public static String getResult() {
		return result;
	}





	public static void setResult(String result) {
		customerdata.result = result;
	}
	public static String ufname;
	public static String ulname;
	public static  String umname;
	public static String uemail;
    
  
	
	
	//--------------------------------------------------------------------------------
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
	//------------------------------------------------------------------------------------
   



	public  String getUfname() {
		return ufname;
	}





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





	public  void setUfname(String ufname) {
		customerdata.ufname = ufname;
	}





	public  String getUlname() {
		return ulname;
	}





	public  void setUlname(String ulname) {
		customerdata.ulname = ulname;
	}





	public  String getUmname() {
		return umname;
	}





	public void setUmname(String umname) {
		customerdata.umname = umname;
	}





	public static String getUemail() {
		return uemail;
	}





	public  void setUemail(String uemail) {
		customerdata.uemail = uemail;
	}





	public List<customer> getL() {
		try {
			L = cm.read();
		}
    	catch(Exception e) {
    		res = e.getMessage();
    	}
    	
    	return L;
	}





	public void setL(List<customer> l) {
		L = l;
	}
	@EJB(lookup = "java:global/datatable/customerroll!com.model.customermanager")
    customermanager cm;
    List<customer> list;
	
    
    
    
	public List<customer> getList() {
		try {
			list = cm.read();
		}
		catch(Exception e) {
			res = e.getMessage();
			
		}
		
		return list;
	}





	public void setList(List<customer> list) {
		this.list = list;
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
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
           
           public String save() {
        	   try {
        		   customer c = new customer();
        		   c.setFname(fname);
        		   c.setMname(mname);
        		   c.setLname(lname);
        		   c.setNation(nation);
        		   c.setEmail(email);
        		   c.setPassword(password);
        		   res = cm.save(c);
        		   return "login.xhtml";
            	   
        	   }
        	   catch(Exception e) {
        		   
        		   res = e.getMessage();
        	   }
        	  return null;
			
           }           
           public String login() throws Exception {
       	    customer c = new customer();
       		c.setEmail(email);
       		c.setPassword(password);
       		String p = cm.login(c);
       		String fn = cm.ufirstname(p);
       		String mn = cm.umiddlename(p);
       		String ln = cm.ulastname(p);
       		String e=cm.uemail(p);
       		     if(p!=null) {
       		     res = "successfully login";
       		     setResult(p);
       		     
       		     setUfname(fn);
       		    
       		     setUmname(mn);
       		  
       		     setUlname(ln);
       		     
       		     setUemail(e);
       		     return "Home.xhtml";
       		     }
       		     else
       		    	 res="failed";
       		     return null;
       	  
        }
         public String apply() throws Exception {
     	   	
     		 String fn2 = cm.tocheck2(ufname);    
     		     if( fn2!= null) {
     		    
     		     return "failapply.xhtml";
     		     }
     		     else
     		    	 return "apply.xhtml";
     		        	   
      }
         public String toapplyb() throws Exception {     
      		String fn1 = cm.toapplyb(ufname);	
        	 String fn2 = cm.tocheck3(ufname); 
      		 if( fn1!=null && fn2!= null) {
      		    
      		     return "failapplyb.xhtml";
      		     }
      		 else {
      			return "apply-b.xhtml";
      		 }
      }
         
         
         public String gotoapply() throws Exception {
        	 
      	   	String fn = cm.ufirstname(result);
      		
      		     if(fn!=null) {
      		     
      		     return "goto.xhtml";
      		     }
      		     else
      		    	 res="failed";
      		     return null;
      	   
       }
      public String userapply() {
    	 customer c = new customer();
    	  try {
    		  c.setFname(ufname);
    		  c.setMname(umname);
    		  c.setLname(ulname);
    		  c.setAge(age);
    		  c.setSex(sex);
    		  c.setFathername(fathername);
    		  c.setMothername(mothername);
    		  c.setDateofbirth(dateofbirth);
    		  c.setPlaceofbirth(placeofbirth);
    		  c.setCountryofplace(countryofplace);
    		  c.setMstatus(mstatus);
    		  c.setPassporttype(passporttype);
    		  c.setPassportnumber(passportnumber);
    		  c.setValidity(validity);
    		  c.setDuration(duration);
    		  c.setType(type);
    		  t=c.getType();
    		  headername = "Eletronic visa";
    		  res =  cm.userSave(c);
    		  if(t.equals("A")) {
    			  setPrize(201.22);
    		  return "payment.xtml"; 
    		  }
    		  else if(t.equals("C")) {
    			  setPrize(101.49);
    		  return "payment.xtml"; 
    		  }
    		  else if(t.equals("D")) {
    			  setPrize(301.08);
    		  return "payment.xtml"; 
    		  }
    	  }
    	  catch(Exception e){
    		 res = e.getMessage(); 
    	  }
    	  
    	  return null;
      }
      
      //-------------------
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





	public String payment() {
    	 customer c = new customer();
    	  try {
    		  c.setFname(ufname);
    		  c.setTypevisa(headername);
    		  c.setAccnumber(accnumber);
    		  c.setValidity(validity);
    		  c.setCvv(cvv);
    		  c.setPrice(prize);
    		  c.setHoldername(holdername);
    		  c.setPstatus("successfully done");
    		   res=cm.payment(c);
    		   cm.tocheck(ufname);
    		   return "sucessfull.xhtml";
    	  }
    	  catch(Exception e) {
    		  res = e.getMessage();
    	  }
    	  return null;
      }
	
	//-------------------
	public static String visatype;
	public static int days;
	public static String userstatus;
	public static String  comment;
	public static String status;
	
	public  String getVisatype() {
		return visatype;
	}





	public void setVisatype(String visatype) {
		customerdata.visatype = visatype;
	}





	public int getDays() {
		return days;
	}





	public void setDays(int days) {
		customerdata.days = days;
	}





	public String getUserstatus() {
		return userstatus;
	}





	public void setUserstatus(String userstatus) {
		customerdata.userstatus = userstatus;
	}





	public String getComment() {
		return comment;
	}





	public void setComment(String comment) {
		customerdata.comment = comment;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		customerdata.status = status;
	}





	public String status() {
		try {
			String p = cm.status(ufname);
			String p2 = cm.yappiled(ufname);
			String p3 = cm.comment(ufname);
			int p4 = cm.days(ufname);
			String l = cm.astatus(ufname);
			String l2 = cm.ayappiled(ufname);
			String l3 = cm.acomment(ufname);
			int l4 = cm.adays(ufname);
			if(p!=null && p2!=null && p3!=null && p4!=0) {
				if(p.equals("no")) {
					setStatus(p);
					setDays(p4);
					setVisatype(p2);
					setComment(p3);
					setUserstatus("your not eligible");
					return "status.xhtml";
				}
				else {
					setStatus(p);
					setDays(p4);
					setVisatype(p2);
					setComment(p3);
					setUserstatus("your are eligible");
					return "status.xhtml";
				}
			}
			if(l!=null && l2!=null && l3!=null && l4!=0) {
				if(l.equals("no")) {
					setStatus(l);
					setDays(l4);
					setVisatype(l2);
					setComment(l3);
					setUserstatus("your book dates will apdated soon...");
					return "status.xhtml";
				}
				else {
					setStatus(l);
					setDays(l4);
					setVisatype(l2);
					setComment(l3);
					setUserstatus("e-visa has conformed your date at physically");
					return "status.xhtml";
				}

			}
			
			
			else {
				res = "your process is not done correctly contact to admin ";
				return "failstatus.xhtml";
			}
		}
		catch(Exception e) {
			res = e.getMessage();
		}
		return null;
	}
	
	//-----------------------applyb
	public String date;
	
	  public String getDate() {
		return date;
	}





	public void setDate(String data) {
		this.date = data;
	}





	public String applyb() {
	    	 customer c = new customer();
	    	  try {
	    		  
	    		  
	    		  
	    		  c.setFname(ufname);
	    		  c.setMname(umname);
	    		  c.setLname(ulname);
	    		  c.setDate(date);
	    		  c.setType(type);
	    		  c.setDays(days);
	    		  t=c.getType();
	    		  headername = "Stamped visa";
	    		  res =  cm.applyb(c);
	    		  if(t.equals("A")) {
	    			  setPrize(201.22);
	    		  return "payment.xtml"; 
	    		  }
	    		  else if(t.equals("C")) {
	    			  setPrize(101.49);
	    		  return "payment.xtml"; 
	    		  }
	    		  else if(t.equals("D")) {
	    			  setPrize(301.08);
	    		  return "payment.xtml"; 
	    		  }
	    	  }
	    	  catch(Exception e){
	    		 res = e.getMessage(); 
	    	  }
	    	  
	    	  return null;
	      }
	
}