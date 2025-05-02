package com.cjc.main.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.model.User;
import com.cjc.main.service.UserService;

@RestController
public class UserController {
	@Autowired UserService userService;
	
	//@PostMapping("/save_user")
	//public ResponseEntity<User>createUser(@RequestPart("user")String userJson,
	//		       @RequestPart("profile")MultipartFile profile){
	//	System.out.println("userJson");
	//	System.out.println("Key Name="+profile.getName());
	//	System.out.println("Original File Name="+profile.getOriginalFilename());
	//	System.out.println("File Size in bytes="+profile.getSize());
		
	//	try {
	//		System.out.println("File byte representation="+profile.getBytes());
	//	} catch (IOException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}

		
	//	return null;
		
	 @PostMapping("/SaveData")
	 public ResponseEntity<User>createUser(@RequestPart("user")String userJson,
			                        @RequestPart(value="prof",required = false)MultipartFile profile,
			                        @RequestPart(value="adhar",required = false)MultipartFile adhar){
		 System.out.println(userJson);
	   User u =userService.SaveUserDetails(userJson,profile, adhar);
	   return new ResponseEntity<User>(u,HttpStatus.CREATED);
	   
		 
	}
	 @GetMapping("/getAllUser")
	public List<User>alluserdata()
	{
		 List<User>u=userService.getAllUserData();
		return u;
		 
	}
   
	 @PutMapping("/update/{username}")
	 public ResponseEntity<User>putdetails(@RequestPart("user")String userJson,
			 @RequestPart(value="prof",required = false)MultipartFile profile,
			 @RequestPart(value="adhar",required = false)MultipartFile adhar,
			@PathVariable String username) {
	User u =userService.updateUserData(userJson,profile,adhar,username);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}

}
