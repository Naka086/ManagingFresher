package com.example.ManagingFresher.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.ManagingFresher.Dto.UserDto;
import com.example.ManagingFresher.Entity.User;
import com.example.ManagingFresher.Repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()),
                userDto.getRole(), userDto.getFullname());
        return userRepository.save(user);
    }

}
