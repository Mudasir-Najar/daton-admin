package com.saras.admin.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.saras.admin.entity.User;

//repository that extends CrudRepository  
public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> getUserByEmail(String email);
	
	Optional<User> getUserByLastName(String lastname);
	
	Optional<User> getUserByTimeZone(String timezone);

	Optional<User> getUserByFristName(String fristname);

}
