package com.javasampleapproach.activemq.models;

import java.util.ArrayList;
import java.util.List;

public class MessageStorage {
	private List<Task> tasks = new ArrayList<Task>();
	
	public void add(Task task) {
		tasks.add(task);
	}
	
	public void clear() {
		tasks.clear();
	}
	
	public List<Task> getAll(){
		return tasks;
	}
}