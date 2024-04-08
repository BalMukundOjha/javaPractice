package com.mukund.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DiffrentSet {

	public static void main(String[] args) {

		Random r = new Random();

		List<Integer> list = new ArrayList<>();
		Set<Integer> s = new LinkedHashSet<>();
		Set<Integer> t = new TreeSet<>();

//		for(int i = 0; i<=10; i++) {
//			int num = r.nextInt(50);
//			list.add(num);
//			s.add(num);
//			System.out.println("List: "+list);
//			System.out.println("Set: "+s);
//		}

		Set<Integer> hs = new HashSet<>();
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		Iterator<Integer> itrr = hs.iterator();
		while (itrr.hasNext()) {
			System.out.println("Hashset no inseration Order " + itrr.next());
			itrr.remove();
		}
		System.out.println("-------------"+hs);

		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		lhs.add(60);
		Iterator<Integer> itr1 = lhs.iterator();
		while (itr1.hasNext()) {
			System.out.println("LinkedHashset inseration Order " + itr1.next());

		}

		Set<Integer> tree = new TreeSet<>();
		tree.add(40);
		tree.add(70);
		tree.add(10);
		tree.add(35);
		tree.add(96);

		Iterator<Integer> itr = tree.iterator();
		while (itr.hasNext()) {
			System.out.println("TreeSet follow Sorting Order ascending or desending: " + itr.next());
		}

	}

}
