package com.david.heavenlysong.controllers;

import com.david.heavenlysong.entities.User;
import com.david.heavenlysong.payloads.ApiResponse;
import com.david.heavenlysong.payloads.UserDto;
import com.david.heavenlysong.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    //GET - get all user
    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllUser(){
        List<UserDto> allUsersDto = this.userService.getAllUsers();
        return new ResponseEntity<>(allUsersDto, HttpStatus.OK);
    }

    //GET = get user by ID
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Integer userId){
        UserDto userById = this.userService.getUserById(userId);
        return ResponseEntity.ok(userById);
    }

    //POST - create user
    @PostMapping("/")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
        UserDto addUserDto = this.userService.createUser(userDto);
        return new ResponseEntity<>(addUserDto, HttpStatus.CREATED);
    }
    //PUT - update user
    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable int userId){
        UserDto updatedUserDto = this.userService.updateUser(userDto, userId);
        return new ResponseEntity<>(updatedUserDto, HttpStatus.OK);
    }

    //DELETE - delete user
    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable Integer userId){
        this.userService.deleteUser(userId);
        return new ResponseEntity<>(new ApiResponse("User with id:"+userId+ " is deleted.",true), HttpStatus.OK) ;
    }

}
