package com.string;
public class palindrome {
	public static void main(String[] args) {

	StringBuffer sb=new StringBuffer("103");
	StringBuffer rev=sb.reverse();
	if(sb.equals(rev))
	{
		System.out.println(true);
	}
	else
	{
		System.out.println(false);
	}

	}
}