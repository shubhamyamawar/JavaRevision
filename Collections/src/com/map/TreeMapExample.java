package com.map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {


		// Note: It prints the elements in sorted(keys in ascending) order

				TreeMap<String,String>hm=new TreeMap<>();
			//ADD
				hm.put("shubham","1");
				hm.put("harshvardhan","2");
				hm.put("sidhesh","3");
				hm.put("yogesh","4");
				System.out.println(hm);
			//Remove
				hm.remove("harshvardhan");
				System.out.println(hm);
			//get
				System.out.println(hm.get("sidhesh"));
			//size
				System.out.println(hm.size());
			//looping keys
				for(String i:hm.keySet())
				{
					System.out.println(i);

				}
			//loping values

				for(String j:hm.values())
				{
					System.out.println(j);
				}

			//both keys and values
				for(String i:hm.keySet())
				{
					System.out.println(i+" "+hm.get(i));
				}



			}







}
