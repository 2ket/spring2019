package com.bit.day04;

import com.bit.day04.modul.Module2;
import com.bit.day04.modul.Module3;

public class Ex02 {
	public static void main(String[] args) {
		// IoC (제어역전) DI (의존주입)
		Module3 module = new Module3();
		module.setModule(new Module3());
		module.func();
	}
}
