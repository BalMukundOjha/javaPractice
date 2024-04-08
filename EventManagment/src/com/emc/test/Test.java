package com.emc.test;

import com.emc.dto.Event;
import com.emc.dto.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventMangaerImpl;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.id = 100;
		organizer.name="BM";
		System.out.println(organizer.id);
		System.out.println(organizer.name);
		
		EventManager em = new EventMangaerImpl();
		Event e = em.create(1234);
		System.out.println(e.getId());

	}

}
