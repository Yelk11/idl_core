package com.yelk11.idle_core;

import java.util.Timer;
import java.util.TimerTask;


public class Automate {
	
	private long tickRate;
	private Task task;
	
	public Automate(Task newTask, long newTickRate)
	{
		this.task = newTask;
		this.tickRate = newTickRate;
	}

	public void autoTasker()
	{
		Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                task.doTask();
            }
        }, 0, tickRate);
		
	}
	
	public void setTickRate(long newTickRate)
	{
		this.tickRate = newTickRate;
	}
}
