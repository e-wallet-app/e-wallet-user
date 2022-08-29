package com.ewallet.user.service;

import com.ewallet.user.dto.request.UserRequestDto;
import com.ewallet.user.dto.response.UserResponseDto;
import com.ewallet.user.entity.User;

import java.io.IOException;
import java.util.List;

public interface UserService {

    void create(UserRequestDto userRequestDto) throws IOException;

    void update(String id, UserRequestDto userRequestDto) throws IOException;

    void delete(String id) throws Exception;

    UserResponseDto getById(String id) throws Exception;

    List<UserResponseDto> getAll();

    User dtoToEntity(UserRequestDto userRequestDto) throws IOException;

    UserResponseDto entityToDto(User user);
}
