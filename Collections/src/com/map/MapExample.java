package com.map;

import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> courses = new HashMap<>();

		// adding elements
		courses.put("core Java", 4000);
		courses.put("Basic python", 3500);
		courses.put("springBoot", 8000);

		System.out.println(courses);

		courses.put("math", 4000);
		System.out.println(courses);
		courses.put("core Java", 5000);
		System.out.println(courses);

	}
//	{Basic python=3500, core Java=4000, springBoot=8000}
//	{Basic python=3500, math=4000, core Java=4000, springBoot=8000}
//	{Basic python=3500, math=4000, core Java=5000, springBoot=8000}
//

}

