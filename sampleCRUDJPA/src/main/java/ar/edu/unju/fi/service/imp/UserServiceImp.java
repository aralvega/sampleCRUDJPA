package ar.edu.unju.fi.service.imp;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.entity.User;
import ar.edu.unju.fi.repository.IUserRepository;
import ar.edu.unju.fi.service.IUserService;

@Service
public class UserServiceImp implements IUserService{
	private IUserRepository userRepository;

	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

}
