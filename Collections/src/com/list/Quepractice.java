package com.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Quepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		arr.add("red");
		arr.add("Blue");
		arr.add("green");
		System.out.println(arr);
		// for
		for (String str : arr) {
			System.out.println(str);
		}
		System.out.println("__________________________________");
		// while forword traversing
		Iterator<String> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("__________________________________");

		// List Iterator :backword traversing
		ListIterator<String> list = arr.listIterator(arr.size());
		while (list.hasPrevious()) {
			System.out.println(list.previous());
		}
		System.out.println("__________________________________");
		// 3 que add at 1st position
		arr.add(0, "Black");
		System.out.println(arr);

		System.out.println("__________________________________");

		// que4&5 get& update

		System.out.println(arr.get(1));
		arr.set(0, "white");
		System.out.println(arr);

		System.out.println(arr.remove(2));
		// sorting ArrayList
		Collections.sort(arr);
		System.out.println(arr);
		ArrayList<String> al = new ArrayList<>();
		al = arr;
		System.out.println(al);
		Collections.copy(al, arr);
		System.out.println(al);
		Collections.reverse(arr);
		System.out.println(arr);

		System.out.println("__________________");

		Collections.shuffle(arr);
		System.out.println(arr);
		List<String> subL = arr.subList(0, 1);
		System.out.println(subL);

	}

}
