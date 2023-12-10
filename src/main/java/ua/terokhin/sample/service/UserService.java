package ua.terokhin.sample.service;

import org.springframework.stereotype.Service;
import ua.terokhin.sample.model.User;
import ua.terokhin.sample.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUser(long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("cannot find by userId"));
    }
}
