package com.ewallet.user.service;

import com.ewallet.user.dto.request.UserRequestDto;
import com.ewallet.user.dto.response.UserResponseDto;
import com.ewallet.user.entity.User;
import com.ewallet.user.repository.UserRepository;
import org.springframework.beans.BeanUtils;

import java.io.IOException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(UserRequestDto userRequestDto) throws IOException {

    }

    @Override
    public void update(String id, UserRequestDto userRequestDto) throws IOException {

    }

    @Override
    public void delete(String id) throws Exception {

    }

    @Override
    public UserResponseDto getById(String id) throws Exception {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));

        return entityToDto(user);
    }

    @Override
    public List<UserResponseDto> getAll() {
        return null;
    }

    @Override
    public User dtoToEntity(UserRequestDto userRequestDto) throws IOException {
        User user = new User();

        BeanUtils.copyProperties(userRequestDto, user);

        return user;
    }

    @Override
    public UserResponseDto entityToDto(User user) {
        return null;
    }
}
