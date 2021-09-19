package edu;

public class TernaryOp {

	public static void main(String[] args) {
		int a=27, b=25, c=15;
		int max =(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(max);

	}

}
