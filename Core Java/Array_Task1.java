package edu;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Array_Task1 {

	public static void main(String[] args) {
		
		int n[]  = {8,1,6,3,5,61,80,102,9};
		
		String result="";
		int count=0;
		for(int i=0;i<n[i];i++) {
			if(n[i]%3==0)
			{
				System.out.println("Number"+n[i]+"is divisible by 3");
			}
			else
			{
				System.out.println("Number"+n[i]+"is not divisible by 3");
			}
			
				n[i]++;
		
			}
			
		

	}

}
