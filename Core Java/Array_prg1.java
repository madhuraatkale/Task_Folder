package edu;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Array_prg1 {

	public static void main(String[] args) {
		
		int Source[] = {5,6,7,8,9,10};
		
		int Destination[] = java.util.Arrays.copyOf(Source, 15);
		
		System.out.println(Arrays.toString(Destination));
		
		int Destination2[] = java.util.Arrays.copyOfRange(Source, 0,5);
		System.out.println(Arrays.toString(Destination2));
	}

}
