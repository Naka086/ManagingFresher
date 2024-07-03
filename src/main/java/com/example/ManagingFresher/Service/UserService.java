package com.example.ManagingFresher.Service;

import com.example.ManagingFresher.Dto.UserDto;
import com.example.ManagingFresher.Entity.User;

public interface UserService {
    User save(UserDto userDto);
}
