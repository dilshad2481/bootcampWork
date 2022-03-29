package com.lwl.cj.day21;

//public class TaskManager {
//	private static TaskManager obj = null;
//	private TaskManager() {
//		
//	}
//	public static TaskManager getInstance() {
////		if(obj == null) {
////			obj = new TaskManager();
////		}
////		return obj;
//		
//		//When one thread enters it check obj
//		//first thread enter synchronized
//		//When 2nd thread comes it might pass 1st obj == null
//		// but has to wait until thread 1 is finished
//		if(obj == null) {
//			synchronized (TaskManager.class) {
//				if(obj == null) {
//					obj = new TaskManager();
//				}
//			}
//		}
//		return obj;
//	}
//	
//	public static void main(String[] args) {
//		//TaskManager obj1 = TaskManager.getInstance();
////		TaskManager obj2 = TaskManager.getInstance();
////		TaskManager obj3 = TaskManager.getInstance();
//		//System.out.println(obj1);
////		System.out.println(obj2);
////
////		System.out.println(obj3);
//		
//		Thread t1 = new Thread(()->{
//			TaskManager obj1 = TaskManager.getInstance();
//			System.out.println(obj1);
//		});
//		
//		Thread t2 = new Thread(()->{
//			TaskManager obj1 = TaskManager.getInstance();
//			System.out.println(obj1);
//		});
//		
//		Thread t3 = new Thread(()->{
//			TaskManager obj1 = TaskManager.getInstance();
//			System.out.println(obj1);
//		});
//		
//		t1.start();
//		t2.start();
//		t3.start();
//	}
//}

//Enum TaskManager
public enum TaskManager{
	instance;
	int value = 10;
	void increment() {
		value++;
	}
	
	void showValue() {
		System.out.println(value);
	}
	public static void main(String[] args) {
		TaskManager obj1 = TaskManager.instance;
		obj1.increment();
		obj1.increment();
		
		obj1.showValue();
		
		TaskManager obj2 = TaskManager.instance;
		obj2.increment();
		obj2.increment();
		
		obj2.showValue();
		
	}
}


