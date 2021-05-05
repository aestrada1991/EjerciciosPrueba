package com.cmc.msuser.service;

import com.cmc.msuser.dao.UserDao;
import com.cmc.msuser.domain.dto.UserDto;
import com.cmc.msuser.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    
    @Autowired
    UserDao userDao;


    @Override
    public List<UserDto> findListUser() {
        List<UserDto> userList = userDao.findUser();
        return userList;
    }
}


