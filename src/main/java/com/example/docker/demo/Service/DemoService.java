package com.example.docker.demo.Service;

import java.util.List;

import com.example.docker.demo.entity.Demo;

public interface DemoService {

	Demo saveDemo(Demo demo);

	List<Demo> getAllDemo();

	Demo getByDemoId(long id);

}
