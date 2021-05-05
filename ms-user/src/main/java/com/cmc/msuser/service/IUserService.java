package com.cmc.msuser.service;

import com.cmc.msuser.domain.dto.UserDto;
import com.cmc.msuser.entities.User;

import java.util.List;

public interface IUserService {
    
    List<UserDto> findListUser();
}
