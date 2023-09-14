package com.example.docker.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.docker.demo.Repository.DemoRepository;
import com.example.docker.demo.Service.DemoService;
import com.example.docker.demo.entity.Demo;


@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoRepository demorepo;
	
	
	@Override
	public Demo saveDemo(Demo demo) {
		return demorepo.save(demo);
	}


	@Override
	public List<Demo> getAllDemo() {
		return demorepo.findAll();
	}


	@Override
	public Demo getByDemoId(long id) {
		return demorepo.findById(id).get();
	}

}
