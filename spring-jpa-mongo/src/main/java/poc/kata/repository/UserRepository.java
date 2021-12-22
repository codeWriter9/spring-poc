package poc.kata.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import poc.kata.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
  List<User> findByNameContaining(String name);
  List<User> findByUsername(String username);
}
