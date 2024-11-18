package vn.lehuuchinh.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.lehuuchinh.laptopshop.domain.User;
import vn.lehuuchinh.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleSave(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }
    public String handleHello() {
        return "hello";
    }
    
}

