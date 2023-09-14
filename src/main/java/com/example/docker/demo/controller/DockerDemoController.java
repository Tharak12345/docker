package com.example.docker.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.demo.Service.DemoService;
import com.example.docker.demo.entity.Demo;

@RestController
@RequestMapping("/docker")
public class DockerDemoController {
	
	@Autowired
	private DemoService demoservice;
	
	@GetMapping("/testapi")
	public String testMethod() {
		return "i am working fine";
	}
	@PostMapping("/")
	public ResponseEntity<Demo> saveDemo(@RequestBody Demo demo) {
		return new ResponseEntity<Demo>(demoservice.saveDemo(demo),HttpStatus.OK);
	}
	@GetMapping("/fetch-all")
	public ResponseEntity<List<Demo>> getAllDemo(){
		return new ResponseEntity<List<Demo>>(demoservice.getAllDemo(),HttpStatus.ACCEPTED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Demo> getByDemoId(@PathVariable("id") long id){
		return new ResponseEntity<Demo>(demoservice.getByDemoId(id),HttpStatus.ACCEPTED);
	}

}
