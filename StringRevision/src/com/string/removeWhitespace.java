package com.string;

public class removeWhitespace {
	public static void main(String[] args) {
		String str=new String("   My Name is Shubham");
		String st=str.replaceAll("\\s","");
		System.out.println(st);


		//remove white space before sentence
		String st1=str.trim();

		System.out.println(st1);

		String str2=str.replaceAll("\\s","");
		System.out.println(str2);

		//conver Integer to string or string to integer
		String sh="10";
		int i=10;
		String z=String.valueOf(i);
		System.out.println(String.valueOf(i));
		System.out.println(Integer.valueOf(sh));
		System.out.println(sh+z);
	}

}
