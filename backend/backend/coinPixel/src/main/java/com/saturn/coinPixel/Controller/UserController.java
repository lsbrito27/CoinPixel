package com.saturn.coinPixel.Controller;

import com.saturn.coinPixel.DTO.UserReqDTO;
import com.saturn.coinPixel.DTO.UserRespDTO;
import com.saturn.coinPixel.Mapper.UserMapper;
import com.saturn.coinPixel.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;
    private final UserMapper mapper;

    public UserController(UserService service, UserMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }


    @PostMapping
    public ResponseEntity<UserRespDTO> createUser(@RequestBody UserReqDTO dto){
       var request = service.createUser(dto);
       var response = mapper.toDto(request);
        return ResponseEntity.ok(response);
    }
}
