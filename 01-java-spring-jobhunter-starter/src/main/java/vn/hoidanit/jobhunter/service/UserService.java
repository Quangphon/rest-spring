package vn.hoidanit.jobhunter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import vn.hoidanit.jobhunter.domain.User;
import vn.hoidanit.jobhunter.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handleCreateUser(User user) {
        return this.userRepository.save(user);
    }

    public void handleDeleteUser(Long id) {
        this.userRepository.deleteById(id);
    }

    public Optional<User> handleGetUser(Long id) {
        return this.userRepository.findById(id);
    }

    public List<User> handleGetListUser() {
        return this.userRepository.findAll();
    }

    public User handleUpdateUser(Long id, User user) {
        user.setId(id);
        return this.userRepository.save(user);
    }

    public User fetchUserById(Long id) {
        Optional<User> user = this.userRepository.findById(id);
        return user.get();
    }

    public User handleGetUserByUsername(String username) {
        return this.userRepository.findByEmail(username);
    }

}
