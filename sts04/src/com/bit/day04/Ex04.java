package com.bit.day04;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

import com.bit.day04.modul.Module5;

public class Ex04 {
	public static void main(String[] args) {
	ApplicationContext ctxt=null;
	ctxt = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Module5 mod=(Module5)ctxt.getBean("mod5");
	
//	System.out.println(Arrays.toString(mod.getArr()));
	System.out.println("------------------------");
	List<String> list = mod.getList();
	for(String msg:list) {
		System.out.println(msg);
	}
	System.out.println("------------------------");
	Set<String> set = mod.getSet();
	for(String msg:set) {
		System.out.println(msg);
	}
	System.out.println("-------------------------");
	
	}
}
