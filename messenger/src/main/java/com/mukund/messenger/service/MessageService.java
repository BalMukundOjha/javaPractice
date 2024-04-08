package com.mukund.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mukund.messenger.database.DatabaseClass;
import com.mukund.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
			messages.put(1L, new Message(1, "Hello World...!", "Mukund"));
			messages.put(2L, new Message(2, "Hello...!", "BM"));
	}
	
		
		//Get Single Message by passing ID
		public Message getMessage(long id) {
			return messages.get(id);	
		}

		public List<Message> getAllMessages() {
		  return new ArrayList<Message>(messages.values());
		}
}
