package com.cgi.micros.pcftest.http;

import java.util.HashMap;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	HashMap<UUID, User> mapUsers = new HashMap<>();

	@Autowired
	public AppController() {
		
	}

	@RequestMapping("/kill")
	public void kill() {
		System.exit(1);
	}

	@RequestMapping("/app-details")
	public String info()  {
		return "This app is a pcf REST app. \n";

	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
    public HashMap<UUID, User> administrateUser(@RequestParam(value="vorName") String vorName,
    												@RequestParam(value="nachName") String nachName,
    														@RequestParam(value="telefonnummer") String telefonnummer,
    															@RequestParam(value="email") String email) {
	   if(!vorName.isEmpty() && !nachName.isEmpty()) {
	       User user = new User(vorName, nachName, telefonnummer, email);
	       mapUsers.put(UUID.randomUUID(), user); 
	   }
       return mapUsers;
    }
	
	@RequestMapping(value="/user", method= RequestMethod.GET)
	public HashMap<UUID, User> getUsers() {
		if(mapUsers.isEmpty())
			return new HashMap<>();
		return mapUsers;
	}
}
