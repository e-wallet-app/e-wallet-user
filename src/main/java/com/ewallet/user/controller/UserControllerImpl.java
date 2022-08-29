package com.ewallet.user.controller;

import com.ewallet.user.dto.request.UserRequestDto;
import com.ewallet.user.dto.response.UserResponseDto;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

public class UserControllerImpl implements UserController{

    @Override
    public ResponseEntity<String> create(UserRequestDto userRequestDto) throws IOException {
        return null;
    }

    @Override
    public ResponseEntity<?> update(String id, UserRequestDto userRequestDto) throws IOException {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(String id) throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<List<UserResponseDto>> getUserList() {
        return null;
    }

    @Override
    public ResponseEntity<UserResponseDto> getUser(String id) throws Exception {
        return null;
    }
}
