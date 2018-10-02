package com.hth.lohit.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.hth.lohit.model.client;

@Service
public class ClientsService {
	Hashtable<String, client> client1 = new Hashtable<String,client>();
    public ClientsService() {
    	client c = new client();
    	c.setAge(22);
    	c.setFirstName("Ajay");
    	c.setLastName("Mittal");
    	c.setId("1");
    	client1.put("1", c);
    	
    	c = new client();
    	c.setAge(32);
    	c.setFirstName("Rohit");
    	c.setLastName("Gupta");
    	c.setId("2");
    	client1.put("2", c);
    }
	
    public client getClient(String id) {
    	if(client1.containsKey(id)) {
    		return client1.get(id);
    	}
    	else
    		return null;
    }
    
    public Hashtable<String, client> getAll(){
    	return client1;
    }
	
}
