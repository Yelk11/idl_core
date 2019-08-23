package com.yelk11.idle_core;

public class ItemBuilder {
	private long value;
	private long tickRate;
	private String taskName;
	
	public ItemBuilder setTaskName(String taskName)
	{
		this.taskName = taskName;
		return this;
	}
	public ItemBuilder setValue(long value)
	{
		this.value = value;
		return this;
	}
	public ItemBuilder setTickRate(long tickRate)
	{
		this.tickRate = tickRate;
		return this;
	}
	public Item getItem()
	{
		return new Item(this.taskName, this.value, this.tickRate);
	}
}
