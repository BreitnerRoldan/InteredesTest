package com.pruebaSpring.servciceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaSpring.entity.User;
import com.pruebaSpring.repository.UserRepository;
import com.pruebaSpring.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User Record(User user) throws Exception {
		Optional<User> c = userRepository.findById(user.getId());

		if (c.isPresent()) {
			throw new Exception("Ya existe un cliente con id " + user.getId());
		}

		return userRepository.save(user);
	}

	@Override
	public void deleted(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User update(Long id, User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
