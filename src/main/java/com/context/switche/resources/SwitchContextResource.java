package com.context.switche.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class SwitchContextResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> teste(){
		System.out.println("Entrou");
		return ResponseEntity.noContent().build();
	}
	
}
