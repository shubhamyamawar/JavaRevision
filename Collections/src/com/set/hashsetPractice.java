package com.set;
import java.util.HashSet;


public class hashsetPractice {
	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
	//ADD
			hs.add("shubham");
			hs.add("mohnish");
			hs.add("yogesh");
			hs.add("harshvardhan");
			hs.add("sidhesh");
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
			System.out.println("_______________________________________________________________");
			System.out.println(hs.removeAll(hs));
			System.out.println(hs);
	//isEmpty
			System.out.println(hs.isEmpty());



		}




}

