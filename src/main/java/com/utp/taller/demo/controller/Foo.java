package com.utp.taller.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.taller.demo.service.Bar;

@RestController
@RequestMapping("/api")
public class Foo {
	
	@Autowired
	private Bar bar;
	
	@GetMapping("/taller-utp")
	public ResponseEntity<?> demo() {
		
		return new ResponseEntity<>(bar.getResult(), HttpStatus.OK);
	}
}
