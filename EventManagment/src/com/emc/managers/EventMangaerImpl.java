package com.emc.managers;

import com.emc.dto.Event;

public class EventMangaerImpl implements EventManager {

	@Override
	public Event create(long id) {
 //Event event = new Event(id, null, null, null, null, null);
		return new Event(id, null, null, null, null, null);
	}

}
