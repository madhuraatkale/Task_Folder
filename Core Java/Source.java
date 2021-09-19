package edu;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
	public static void main(String args[] ) throws Exception {
	
	String Firstname="Harry";
	String Lastname="Ron";
	Source sourceObj=new Source();
	try{
	String name=	sourceObj.Checkname(Firstname,Lastname);
	System.out.println("Name is : " +name);
	}
	catch (MyException e){
	    System.out.println(e.getMessage());
	}
	}
	 public String Checkname(String Firstname,String Lastname)throws MyException
	    {
	     if (Firstname=="" || Lastname==""){
	         throw new MyException("Name should not be blank");
	     }
	     else {
	         String name=Firstname + Lastname;
	         return name;
	     }
	 }
	 }

class MyException extends Exception{
 public MyException (String S){
     super(S);
 }
  //public String Checkname(String Firstname,String Lastname)//
}