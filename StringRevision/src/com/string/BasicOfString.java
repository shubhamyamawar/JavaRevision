package com.string;

import java.util.Arrays;

public class BasicOfString{
	public static void main(String [] args)
	{
		char ch[]= {'s','h','u','b','h'};
    	System.out.println(ch);
		String s=new String(ch);
		System.out.println(s);
		System.out.println(s+"am");
		 s=s.concat("am");
		 System.out.println(s);


//concatenation using StringBuilder class

     StringBuilder s1=new StringBuilder("Hello");
     StringBuilder s2=new StringBuilder("World");

     StringBuilder s3=s1.append(s2);
     System.out.println(s3);
     System.out.println(s3.toString());
	System.out.println("---------------------------------");

//		Split the String Using WhiteSpace

String text=new String("hello my name is Shubham");
String [] s4=text.split(" ");

System.out.println(Arrays.toString(s4));
System.out.println("______________________________________");

String aaa="";
for(String ss:s4)
{
	aaa=aaa.concat(ss);
}
System.out.println(aaa);
System.out.println(aaa.trim());



String m="shubham";
String n=new String("shubham");
String a="  ";
String o=n.intern();
int z=10;

for (String element : s4) {
 a=a.concat(element);
}
System.out.println(a);
System.out.println(a.length());
        System.out.println(a.substring(15));
        System.out.println(a.substring(14, a.length()));
		System.out.println(a.toUpperCase());
		System.out.println(a.trim());
		System.out.println(a.charAt(15));
		System.out.println(a.endsWith("am"));
		System.out.println(m.startsWith("sh"));
		System.out.println(m==n);
		System.out.println(m.equals(n));
		System.out.println(m==o);
		System.out.println(String.valueOf(z));


//StringBuffer
		StringBuffer sb=new StringBuffer("Vikram");
		sb.append("shinde");
		System.out.println(sb);
	    System.out.println(sb.insert(0, "__"));
	    System.out.println(sb.replace(0, 3, ""));
	    System.out.println(sb.delete(0,1));




	}
}

