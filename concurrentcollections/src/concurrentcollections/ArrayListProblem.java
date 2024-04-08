package concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem {

	public static void main(String[] args) {

		// ArrayList<String> l = new ArrayList<>();
		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
		l.add("java");
		l.add("python");
		l.add("AWS");
		l.add("docker");
		l.add("RestAPI");

		Iterator<String> iterator = l.iterator();

		while (iterator.hasNext()) {
			String course = iterator.next();
			System.out.println(course);
			l.add("Hibernate");
		}
		
		System.out.println(l);

	}

}
