package ar.edu.unju.fi.service;

import ar.edu.unju.fi.entity.User;

public interface IUserService {
	Iterable<User> getAllUsers();
}
