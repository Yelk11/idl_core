package com.yelk11.idle_core;

import java.util.ArrayList;

public class World {
	private ArrayList<Maker> makerList = new ArrayList<Maker>();
	
	private Maker maker;
	public void addMaker()
	{
		maker = new Maker();
		makerList.add(maker);
	}
	public Maker getMaker(int makerNum)
	{
		return makerList.get(makerNum);
	}
}
