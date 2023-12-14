package com.string;

public class ToString {
	int rollno;
	String city;
	String name;

	ToString(int rollno1,String city1,String name1)
	{
		this.rollno=rollno1;
		this.city=city1;
		this.name=name1;
	}
	@Override
	public String toString()
	{
		return rollno+" "+name+" "+city;
	}
	public static void main(String[] args) {
		ToString s1=new ToString(102,"shubham","talodhi");
		ToString s2=new ToString(103,"shubhyamawar","Gadchiroli");

		System.out.println(s1);
		System.out.println(s2);

	}

}

