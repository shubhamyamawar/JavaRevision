package com.set;

import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {


			LinkedHashSet<String>hs=new LinkedHashSet<>();
		//ADD
				hs.add("shubham");
				hs.add("mohnish");
				hs.add("yogesh");
				hs.add("harshvardhan");
				hs.add("sidhesh");
				System.out.println(hs);
// Note: This will not add new element
// as A already exists
				hs.add("shubham");
				System.out.println(hs);



		//Check If an Item Exists
				System.out.println(hs.contains("shubham"));

		//Remove
				hs.remove("harshvardhan");
				System.out.println(hs);

		//size
				System.out.println(hs.size());

		//looping
				for(String i:hs)
				{
					System.out.println(i);

				}
		//removeAll
				System.out.println(hs.removeAll(hs));
				System.out.println(hs);
		//isEmpty
				System.out.println(hs.isEmpty());



			}







}
