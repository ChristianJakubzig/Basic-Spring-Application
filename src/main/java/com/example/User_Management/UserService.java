package com.example.User_Management;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public List<User> getAllUsers(){
        return users;
    }

    public Optional<User> getUsersByID(Long id){
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public User createUser(String name, String email, int alter){
        User newUser = new User(counter.incrementAndGet(), name, email, alter);
        users.add(newUser);
        return newUser;
    }

    public Optional<User> updateUser(Long id, String name, String email, int age){
        return getUsersByID(id).map(user -> {
            user.setName(name);
            user.setEmail(email);
            user.setAlter(age);
            return user;
        });
    }

    public boolean deleteUser(Long id){
        return users.removeIf(user -> user.getId().equals(id));
    }
}
