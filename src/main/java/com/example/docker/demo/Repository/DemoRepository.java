package com.example.docker.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.docker.demo.entity.Demo;
@Repository
public interface DemoRepository extends JpaRepository<Demo, Long>{

}
