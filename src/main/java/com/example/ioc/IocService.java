package com.example.ioc;

import org.springframework.stereotype.Service;

@Service
public class IocService {

	public String greet() {
		return "Hello from Service";
	}
}
