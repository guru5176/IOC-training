package com.example.ioc;

import org.springframework.stereotype.Component;

@Component
public class Pencil implements Writer {

	@Override
	public void write() {
		System.out.println("Writing with Pencil");
	}
}
