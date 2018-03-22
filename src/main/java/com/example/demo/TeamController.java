package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	
	@Autowired
	TeamRepository teamRepository;
	
	@GetMapping("/teams")
	public Iterable<Team> getTeams() 
	{
		List<Team> list = (List<Team>) teamRepository.findAll();
		System.out.println("findall count :"+teamRepository.count());
		return list;
	}

}
