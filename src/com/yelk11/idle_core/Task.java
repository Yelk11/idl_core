package com.yelk11.idle_core;

public class Task implements Makeable{
	private long amount = 0;
	private long tickRate;
	private double incrementMultiplier;
	private boolean isEnabled;
	
	
	/**
	 * 
	 */
	public void make()
	{
		if(isEnabled)
		{
			amount = (long) incrementMultiplier * amount;
		}
	}
	/**
	 * 
	 */
	public void enable()
	{
		this.isEnabled = true;
	}
	/**
	 * 
	 */
	public void disable()
	{
		this.isEnabled = false;
	}
	/**
	 * 
	 * @return amount
	 */
	public long getAmount()
	{
		return amount;
	}
	/**
	 * 
	 * @param amount
	 */
	public void setAmount(long amount)
	{
		this.amount = amount;
	}
	/**
	 * 
	 * @return incrementMultiplier
	 */
	public double getIncrementMultiplier() {
		return incrementMultiplier;
	}
	/**
	 * 
	 * @param incrementMultiplier
	 */
	public void setIncrementMultiplier(double incrementMultiplier) {
		this.incrementMultiplier = incrementMultiplier;
	}
	/**
	 * 
	 * @return tickRate
	 */
	public long getTickRate() {
		return tickRate;
	}
	/**
	 * 
	 * @param tickRate
	 */
	public void setTickRate(long tickRate) {
		this.tickRate = tickRate;
	}


	public static class Builder {
		
		private Task task;
		private double incrementMultiplier;
		private long tickRate;
		private long amount;
		
		public void setIncrementMultiplier(double incrementMultiplier) {
			this.incrementMultiplier = incrementMultiplier;
		}
		public void setAmount(long amount)
		{
			this.amount = amount;
		}
		private void setTickRate(long tickRate)
		{
			this.tickRate = tickRate;
		}
		public Task build()
		{
			task = new Task();
			
			task.setIncrementMultiplier(incrementMultiplier);
			task.setAmount(amount);
			task.setTickRate(tickRate);
			
			
			return task;
		}
	}
}
