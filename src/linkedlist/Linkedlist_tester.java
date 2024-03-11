package linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist_tester {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.rotate(list, 2);
		
		//Laufvariable für Collections
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
		
		

	}

}
