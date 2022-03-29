package com.lwl.cj.day20;



class TaskManager implements Cloneable{
	
	private static TaskManager obj = null;
	
	//Create private so that can't create object
	private TaskManager() {
		
	}
	
	public static TaskManager getInstance() {
		if(obj == null) {
			obj = new TaskManager();
		}
		return obj;
	}
	
	@Override
	protected TaskManager clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Sorry! this object can't be cloned");
	}
	
}

public class SingletonClass {
	public static void main(String[] args) {
		TaskManager obj1 = TaskManager.getInstance();
		TaskManager obj2 = null;
		try {
			obj2 = obj1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
