package com.utp.taller.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BarImpl implements Bar {

	@Override
	public Map<String, String> getResult() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("Key5", "Taller Exposicion");
		result.put("Key4", "Bar");
		result.put("Key3", "Foo");
		result.put("Key2", "Hello World");
		result.put("Key1", "Demo Taller UTP 123");
		return result;
	}
}
