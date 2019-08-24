package com.yelk11.idle_core;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Maker {
	private ArrayList<Makeable> taskList = new ArrayList<Makeable>();
	private long tickRate = 1;
	private TimerTask timerTask;
	private Timer timer;
	
	/**
	 * 
	 */
	public void start()
	{
		this.maker();
	}
	/**
	 * 
	 */
	public void stop()
	{
		timer.cancel();
	}
	/**
	 * 
	 * @param tickRate
	 */
	public void updateTickRate(long tickRate)
	{
		stop();
		this.tickRate = tickRate;
		start();
	}
	/**
	 * 
	 */
	private void maker()
	{
		timerTask = new TimerTask(){
			@Override
			public void run() {
				taskList.forEach((n) -> n.make());
			}
		};
		timer.schedule(timerTask, tickRate);
	}
	/**
	 * 
	 * @param makeable
	 */
	public void add(Makeable makeable)
	{
		this.taskList.add(makeable);
	}
	
	/** 
	 * Set the rate at which the Tasker makes the Makable
	 * 
	 * @param tickRate Time in milliseconds
	 * 
	 */
	public void setTickRate(long tickRate)
	{
		this.tickRate = tickRate;
	}
	
	public static class Builder{
		
		private Makeable makeable;
		private int tickRate = 1;
		/**
		 * Add a Makable to the Tasker list
		 * 
		 * @param makeable
		 */
		public void add(Makeable makeable) 
		{
			this.makeable = makeable;
		}
		/**
		 * Set the rate at which the Tasker makes the Makable
		 * 
		 * @param newTickRate Time in milliseconds
		 */
		public void setTickrate(int newTickRate)
		{
			this.tickRate = newTickRate;
		}
		public Maker build()
		{
			Maker myTasker = new Maker();
			myTasker.add(makeable);
			myTasker.setTickRate(tickRate);
			return myTasker;
		}
	}
}
