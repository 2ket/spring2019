package com.bit.day04.modul;

public class Module3 {
	Module module;
	public void setModule(Module module) {
		this.module = module;
	}
	
	public void func() {
		System.out.println(module.getMsg());
	}
}
