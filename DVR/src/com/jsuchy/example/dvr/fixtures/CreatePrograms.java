package com.jsuchy.example.dvr.fixtures;

public class CreatePrograms {
	
	private String name;
	private int channel;
	private String dayOfWeek;
	private String timeOfDay;
	private int durationInMinutes;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	
	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	
	public String id() {
		return String.format("[%s:%d]", name, channel);
	}
}