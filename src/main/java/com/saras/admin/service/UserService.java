package com.saras.admin.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.saras.admin.entity.User;
import com.saras.admin.exception.AppException;
import com.saras.admin.exception.ResponseCodeEnum;
import com.saras.admin.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	// getting all users by using the method findAll() of crud repository
	public List<User> getAllUser() {
		List<User> User = new ArrayList<User>();
		userRepository.findAll().forEach(User1 -> User.add(User1));
		return User;
	}

	// getting a specific record by using the method findById() of CrudRepository
	public User getUserById(int Id) {
		return userRepository.findById(Id).get();
	}

	// saving a specific record by using the method save() of CrudRepository
	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}

	// deleting a specific record by using the method deleteById() of CrudRepository
	public void delete(int id) {
		userRepository.deleteById(id);
	}

	// updating a record
	public void update(User user, int userid) {
		userRepository.save(user);
	}

	public User getUserByEmail(String email) {
		return userRepository.getUserByEmail(email)
				.orElseThrow(()-> new AppException(ResponseCodeEnum.EMAIL_NOT_FOUND));
	}

	public User getUserByFristName(String fristname) {
		return userRepository.getUserByFristName(fristname)
				.orElseThrow(()-> new AppException(ResponseCodeEnum.FRISTNAME_NOT_FOUND));

	}

	public User getUserByLastName(String lastname) {
		return userRepository.getUserByLastName(lastname)
				.orElseThrow(()-> new AppException(ResponseCodeEnum.LASTNAME_NOT_FOUND));
	}

	public User getUserByTimeZone(String timezone) {
		return userRepository.getUserByTimeZone(timezone)
				.orElseThrow(()-> new AppException(ResponseCodeEnum.TIMEZONE_NOT_FOUND));
	}

	}

