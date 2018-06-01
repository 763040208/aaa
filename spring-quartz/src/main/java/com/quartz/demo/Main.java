package com.quartz.demo;

import org.quartz.Job;

public class Main {
	public static void main(String[] args) {
		String code = Job1Demo.AC.getCode();
		String code2 = Job1Demo.BC.getCode();
		String desc = Job1Demo.AC.getDesc();
		String desc2 = Job1Demo.BC.getDesc();
		
		System.out.println(code + desc + "\n" + code2 + desc2);
	}
}
