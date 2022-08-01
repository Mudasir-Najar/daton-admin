package com.saras.admin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.saras.admin.entity.User;
import com.saras.admin.service.UserService;

@RestController
public class UserController {

	// AutoWired author user class
	@Autowired
	UserService userServices;

	// creating a get mapping that retrieves all the user details from the database
	@GetMapping("/user")
	private ResponseEntity<RestApiResponse<List<User>>> getAllUser() {
		return ResponseEntity.ok(RestApiResponse.<List<User>>builder().data(userServices.getAllUser()).build());
	}

	// creating a mapping that retrieves the detail of user
	@GetMapping("/user/{user-id}")
	private ResponseEntity<RestApiResponse<User>> getUser(@PathVariable("UserId") int userid) {
		return ResponseEntity.ok(RestApiResponse.<User>builder().data(userServices.getUserById(userid)).build());
	}

	// crating a delete mapping that deletes a user
	@DeleteMapping("/user/{user-Id}")
	private void deleteUser(@PathVariable("User-id") int userid) {
		userServices.delete(userid);
	}

	@PostMapping("/user")
	private String saveUser(@RequestBody User user) {
		userServices.saveOrUpdate(user);
		return user.getFristName();
	}
	
	@GetMapping("/user/email/{email}")
	private ResponseEntity<RestApiResponse<User>>getUserByEmail(@PathVariable("email") String email) {
		return ResponseEntity
				.ok(RestApiResponse.<User>builder().data(userServices.getUserByEmail(email)).build());
 }
	@GetMapping("/user/fristname/{fristname}")
	private ResponseEntity<RestApiResponse<User>>getUserByFristName(@PathVariable("fristname") String fristname) {
		return ResponseEntity
				.ok(RestApiResponse.<User>builder().data(userServices.getUserByFristName(fristname)).build());
 }
	@GetMapping("/user/lastname/{lastname}")
	private ResponseEntity<RestApiResponse<User>>getUserByLastName(@PathVariable("lastname") String lastname) {
		return ResponseEntity
				.ok(RestApiResponse.<User>builder().data(userServices.getUserByLastName(lastname)).build());
 }
	@GetMapping("/user/timezone/{timezone}")
	private ResponseEntity<RestApiResponse<User>>getUserByTimeZone(@PathVariable("timezone") String timezone) {
		return ResponseEntity
				.ok(RestApiResponse.<User>builder().data(userServices.getUserByTimeZone(timezone)).build());
 }

	}
