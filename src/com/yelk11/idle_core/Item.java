package com.yelk11.idle_core;

public class Item {

	private long itemCost;
	private long value;
	private String name;
	private Task task;
	
	Item(String newName, long newValue, long tickRate)
	{
		this.name = newName;
		this.value = newValue;
	}
	
	
	
}
