package com.cjc.main.serviceimple;

import java.io.IOException;
import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.model.User;
import com.cjc.main.repository.UserRepository;
import com.cjc.main.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class UserServiceImple implements UserService {
	@Autowired UserRepository userRepository;

	@Override
	public User SaveUserDetails(String userJson, MultipartFile profile, MultipartFile adhar) {
	
		ObjectMapper mapper=new ObjectMapper();
		User u=null;
		try {
			     u=mapper.readValue(userJson, User.class);
		}catch(JsonProcessingException e) {
			e.printStackTrace();
		}
		try {
			if(profile!=null)
			{
				u.setProfileImage(profile.getBytes());
				
			}
			if(adhar!=null)
			{
				u.setAdharCard(adhar.getBytes());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		 User dbUser=userRepository.save(u);
	
		
		return dbUser;
	}

	@Override
	public List<User> getAllUserData() {
	Iterable<User>u=userRepository.findAll();
		return (List<User>) u;
	}

	@Override
	public User updateUserData(String userJson, MultipartFile profile, MultipartFile adhar, String username) {
		ObjectMapper mapper=new ObjectMapper();
		User u=null;
		try {
			     u=mapper.readValue(userJson, User.class);
		}catch(JsonProcessingException e) {
			e.printStackTrace();
		}
		try {
			
			if(profile!=null)
			{
				u.setProfileImage(profile.getBytes());
				
			}
			if(adhar!=null)
			{
				u.setAdharCard(adhar.getBytes());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		 User dbUser=userRepository.save(u);
	
		
		return dbUser;
	}
}