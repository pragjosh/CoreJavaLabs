package com.cg;

public class classA
{
	    public static void main(String[] args)
		{

	    	 Date doj  = new Date(11,12,2013); 
	    	 Employee emp = new Employee("Pragya","Joshi",15000,"A3", doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	     	
	         doj  = new Date(9,06,2013);
	    	 emp = new Employee("Sugandha","Sharma",45000,"A5",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(8,05,2011);
	    	 emp = new Employee("Shirley","Setia",90000,"A5",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(7,06,2014);
	    	 emp =  new Employee("Hiba","Shahid",21000,"A2",doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	    	 
	 	     doj  = new Date(12,12,2016);
	    	 emp = new Employee("Jyothi","Raj",55000,"B3",doj);
	 		 emp.displayentry();	
	 		 doj.displayDate();
	 		 
	    emp.displaycount();
	   }
	}