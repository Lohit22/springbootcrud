package com.hth.lohit.controller;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hth.lohit.exception.ResourceNotFoundException;
import com.hth.lohit.model.client;
import com.hth.lohit.respository.UserRespository;
import com.hth.lohit.service.ClientsService;

@RestController
@RequestMapping("/clients")
public class CustomerController {
	@Autowired
     UserRespository userRepository;
	
	/*@Autowired
	ClientsService cs;
	
	@RequestMapping("/allx")
	public Hashtable<String, client> getAll(){
    	return cs.getAll();
    }
	
	@RequestMapping("{id}")
	public client getClient(@PathVariable("id") String id) {
		return cs.getClient(id);
	}*/
	
	@GetMapping("/all")
	public List<client> getAllNotes() {
	    return userRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public client getNoteById(@PathVariable(value = "id") String noteId) {
	    return userRepository.findById(noteId)
	            .orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
	}
}
