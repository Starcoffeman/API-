package ru.practicum.shareit.user;

import ru.practicum.shareit.user.model.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto saveUser(UserDto userDto);

    UserDto getUserById(long userId);

    UserDto update(long userId, UserDto userDto);

    void deleteUserById(long userId);

}
