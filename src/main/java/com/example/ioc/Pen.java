package com.example.ioc;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Writer {

	public Pen() {
		System.out.println("Pen bean created");
	}

	@Override
	public void write() {
		System.out.println("Writing with Pen");
	}
}
