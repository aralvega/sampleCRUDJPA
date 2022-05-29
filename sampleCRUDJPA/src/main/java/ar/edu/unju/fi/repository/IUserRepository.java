package ar.edu.unju.fi.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.entity.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Long>{
	public Optional<User> findByUserName(String userName);
	
	public Optional<User> findByIdAndPassword(Long id, String password);
}
