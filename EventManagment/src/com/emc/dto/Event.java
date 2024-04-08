package com.emc.dto;

public class Event {
	
	private long id;
	private String name;
	private String descriptionString;
	private String startDate;
	private String endDate;
	private Boolean started ;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptionString() {
		return descriptionString;
	}

	public void setDescriptionString(String descriptionString) {
		this.descriptionString = descriptionString;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Boolean getStarted() {
		return started;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}

	public Event(long id, String name, String descriptionString, String startDate, String endDate, Boolean started) {
		super();
		this.id = id;
		this.name = name;
		this.descriptionString = descriptionString;
		this.startDate = startDate;
		this.endDate = endDate;
		this.started = started;
	}

}
