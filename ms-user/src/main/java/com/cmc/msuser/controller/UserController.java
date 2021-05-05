package com.cmc.msuser.controller;


import com.cmc.msuser.domain.dto.UserDto;
import com.cmc.msuser.service.UserService;
import com.cmc.msuser.domain.dto.ApiError;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@Api(value = "/user", tags = "Users Information")
@RestController
@RequestMapping("UserService")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/users")
    @ApiOperation(value = "Retorna el listado de usuarios", response = UserDto.class)
    public ResponseEntity<Object> findUsers() throws ParseException {
        try {
            return new ResponseEntity<>(userService.findListUser(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ApiError(HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error occurred when finding users.", e.getLocalizedMessage()), new HttpHeaders(),
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

