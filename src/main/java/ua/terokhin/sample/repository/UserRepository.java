package ua.terokhin.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.terokhin.sample.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}