package com.cmc.msuser.dao;

import com.cmc.msuser.domain.dto.UserDto;
import com.cmc.msuser.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User, Integer> {
    @Query("SELECT new com.cmc.msuser.domain.dto.UserDto( " +
            "U.fullName, " +
            "U.phoneContact, " +
            "U.email, " +
            "U.userCode, " +
            "U.lastAuthenticationDate, " +
            "U.lastAuthenticationHour, " +
            "U.numberTest) " +
            "FROM User U ")
    List<UserDto> findUser();

}

