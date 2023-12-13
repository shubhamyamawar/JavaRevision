package com.list;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListt {
	public static void main(String[] args) {
		// Initialised Arraylist
				LinkedList<Integer> list = new LinkedList<>();

				// add elements(OUTPUT:[0, 2, 3])
				list.add(0);
				list.add(2);
				list.add(3);
				System.out.println(list);

				System.out.println("_________________________________________________________");
			//add element first position and last position
				list.addFirst(15);
				list.addLast(12);
				System.out.println(list);

				// getelements (OUTPUT:2)
				int element = list.get(1);// index
				System.out.println(element);

		//get elemet first position and last position
				System.out.println(list.getFirst());
				System.out.println(list.getLast());

				// add element in between(OUTPUT:[0, 5, 2, 3])
				list.add(1, 5);// (index,element)
				System.out.println(list);

				// set element(OUTPUT:[0, 7, 2, 3])
				list.set(1, 7);// (index,element)
				System.out.println(list);

				// delete element(OUTPUT:[0, 2, 3])
				list.remove(1);// index
				System.out.println(list);

		//remove element  first position and last position
				list.removeFirst();
				list.removeLast();
				System.out.println(list);




				// size(OUTPUT:3)
				int size1 = list.size();
				System.out.println(size1);

				// loops(OUTPUT:023)
				for (Integer element2 : list) {
					System.out.print(element2);
				}
				System.out.println();

				// sorting([0, 2, 3, 10])
				list.add(1, 10);
				System.out.println(list);
				Collections.sort(list);
				System.out.println(list);
				//sorting in reverse order
				Collections.sort(list, Collections.reverseOrder());
				System.out.println(list);

				// check for empty
				System.out.println(list.isEmpty());

				// type ka equal method call karata hai checking karne ke liye
				System.out.println(list.contains(2));
			     list.add(1, 20);
				System.out.println(list);
				//Sublist

				System.out.println(list.subList(0, 3));

				//return the referance index
				System.out.println(list.lastIndexOf(10));



	}

}
