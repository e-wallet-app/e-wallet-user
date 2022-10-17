package com.ewallet.user.controller;

import com.ewallet.user.dto.request.UserRequestDto;
import com.ewallet.user.dto.response.UserResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequestMapping("/api/v1/user")
public interface UserController
{
    @PostMapping("/")
    ResponseEntity<String> create(@RequestBody UserRequestDto userRequestDto) throws IOException;

    @PutMapping("/{id}")
    ResponseEntity<?> update(@PathVariable("id") String id, @RequestBody UserRequestDto userRequestDto) throws IOException;

    @DeleteMapping("/{id}")
    ResponseEntity<?> delete(@PathVariable("id") String id) throws Exception;

    @GetMapping("/")
    ResponseEntity<List<UserResponseDto>> getUserList();

    @GetMapping("/{id}")
    ResponseEntity<UserResponseDto> getUser(@PathVariable("id") String id) throws Exception;
}