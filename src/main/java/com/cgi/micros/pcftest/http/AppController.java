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
	
	HashMap mapUsers = new HashMap();

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
    public HashMap<UUID, User> administrateUser(@RequestParam(value="vorName", defaultValue="Harry") String vorName,
    							@RequestParam(value="nachName", defaultValue="Hirsch") String nachName,
    								@RequestParam(value="telfonnummer", defaultValue="00496099921954") String telefonnummer,
    									@RequestParam(value="personalnummer", defaultValue="test@pcf.io") String personalnummer) {
		
       User user = new User(vorName, nachName, telefonnummer, personalnummer);
       mapUsers.put(UUID.randomUUID(), user); 
       return mapUsers;
    }
	
	@RequestMapping(value="/user", method= RequestMethod.GET)
	public HashMap<UUID, User> getUsers() {
		return mapUsers;
	}
}
