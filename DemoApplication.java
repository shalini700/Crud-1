package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.ShaliniStudent;
import com.example.demo.repository.ShaliniStudentRepository;

import ch.qos.logback.classic.Logger;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	@Autowired
	private ShaliniStudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	ShaliniStudent shalinistudent=	repository.findById(10002);
	
	//logger.info("ShaliniStudent 10001 -> {}" );
	System.out.println("ShaliniStudent 10002 -> {} " + repository.findById(10002));
	//repository.DeleteById(10002);
	}
	
}
