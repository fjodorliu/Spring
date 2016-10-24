package com.fjodor.hello.controller;

public class MainTest {
	
	public void testLong() {
		Long ttt = null;
		long xyz = 123;
		
		//ttt = (Long) xyz;
		
		if (ttt == null) {
			System.out.println("******" + ttt.longValue());
		} else {
			System.out.println("===:" + ttt.longValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainTest mt = new MainTest();
		mt.testLong();
	}

}
