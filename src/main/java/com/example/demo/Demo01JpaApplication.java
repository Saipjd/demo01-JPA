package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo01JpaApplication {

	@Autowired
	TeamRepository teamRepository;
	
	@PostConstruct
	public void init()
	{
		List<Team> list = new ArrayList<>();
		Team team = new Team();
	  	team.setId(0l);
	  	team.setLocation("Harlem");
	  	team.setName("Globetrotters");
	  	list.add(team);
	  	
	  	
	  	team = new Team();
	  	team.setId(1l);
	  	team.setLocation("Washington");
	  	team.setName("Generals");
	  	list.add(team);
	  	
	  	team = new Team();
	  	team.setId(1l);
	  	team.setLocation("London");
	  	team.setName("Royals");
	  	list.add(team);
	  	
	  	for (Team entity : list) {
	  		//teamRepository.save(entity);
	    }

	  	
	  	List<Team> listall = (List<Team>)teamRepository.saveAll(list);
	  
		System.out.println("Total : " + listall.size()) ;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo01JpaApplication.class, args);
	}
}
