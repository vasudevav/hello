package com.vasu.bean;

import java.util.List;

public class Bike {

	private List<String> laptop;

	@Override
	public String toString() {
		return "Bike [laptop=" + laptop + "]";
	}

	public void setLaptop(List<String> laptop) {
		this.laptop = laptop;
	}
	
}
