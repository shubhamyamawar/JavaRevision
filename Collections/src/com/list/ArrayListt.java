package com.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(5);
		arr.add(2);
		arr.add(3);
		arr.add(7);
		arr.add(0);
		arr.add(10);
		System.out.println(arr);
		for (Integer i : arr) {
			System.out.println(i);
		}
		ArrayList<Integer> a = new ArrayList<>();
		a.add(20);
		a.addAll(arr);
		System.out.println(a);
		int aa = arr.get(1);
		System.out.println(aa);
		System.out.println(arr.contains(11));
		System.out.println(arr.indexOf(5));
		System.out.println(a.removeAll(a));
		System.out.println(a);
		System.out.println(arr);
		System.out.println(arr.remove(0));
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(a.isEmpty());
		System.out.println(arr.isEmpty());
		System.out.println(arr);
		System.out.println(arr.set(0, 100));
		System.out.println(arr);
		Collections.sort(arr);
		for (Integer i : arr) {
			System.out.println(i);
		}
		System.out.println("______________________________________________________________________________");

		Collections.sort(arr, Collections.reverseOrder());
		for (Integer i : arr) {
			System.out.println(i);
		}
		System.out.println(arr);
		arr.add(4, 100);
		System.out.println(arr);
		System.out.println(arr.lastIndexOf(100));
		// arr.clear();
		// System.out.println(arr);
		// System.out.println(arr.sort());
		
		
		//Practice
		List<Integer>itr=List.of(1,2,3);
		System.out.println(itr);
		ArrayList<Integer>itr2=new ArrayList<>();
		itr2.add(2);
		itr2.add(3);
		itr2.add(5);
		itr2.add(1);
		itr2.add(20);
		System.out.println(itr2);
		System.out.println(itr2.get(2));
		System.out.println(itr2.set(1, 200));
		System.out.println(itr2);
		System.out.println(itr2.isEmpty());
		System.out.println(itr.contains(4));
		System.out.println(itr2.size());
		for(Integer i:itr2)
		{
			System.out.print(i+" ");
		}
		Collections.sort(itr2);
		System.out.println(itr2);
	}

	

}
