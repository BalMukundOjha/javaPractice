package com.mukund.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		
		for(int i =0; i<=10; i++) {
			int num = random.nextInt(5);
			list.add(num);
		}
		System.out.println("List: "+list);
		Set<Integer> set = new HashSet<>(list);
		System.out.println("Set: "+set);
	}
	
	

}
