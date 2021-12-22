package poc.kata.controller;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import poc.kata.domain.User;
import poc.kata.repository.UserRepository;

@RestController
public class UserController {

	private static Logger LOG = getLogger(lookup().lookupClass());

	@Autowired
	private UserRepository userRepository;


	@GetMapping("/userNames")
	public ResponseEntity<List<User>> getAllUserNames(@RequestParam(required = false) String username) {
	  try {
	    List<User> users = new ArrayList<User>();

	    if (username == null)
	      userRepository.findAll().forEach(users::add);
 	   else
	      userRepository.findByUsername(username).forEach(users::add);

    	   if (users.isEmpty()) {
	      	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   	   }

  	   return new ResponseEntity<>(users, HttpStatus.OK);
	  }
	 catch (Exception e) {
   	 	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
 	 }
	}

}
