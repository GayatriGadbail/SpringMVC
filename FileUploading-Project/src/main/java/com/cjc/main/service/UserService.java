package com.cjc.main.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.model.User;

public interface UserService {

	public User SaveUserDetails(String userJson, MultipartFile profile,MultipartFile adhar);

	public List<User> getAllUserData();

	public User updateUserData(String userJson, MultipartFile profile, MultipartFile adhar, String username);

}
