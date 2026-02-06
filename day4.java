package com.chitkara.oops;

public class student {
	int id;
	String nameString;
	private student() {
		
	}
	static student getobj() {
		return new student();
	}
}
class Main{
	public static void main(String[] args) {
		student student= student.getobj();
	}
}
