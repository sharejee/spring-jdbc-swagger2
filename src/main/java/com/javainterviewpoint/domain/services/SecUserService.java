package com.javainterviewpoint.domain.services;

import com.javainterviewpoint.domain.models.SecUser;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/12/2018
*/
public interface SecUserService {
    List<SecUser> getAllUsers();

    SecUser getUserById(String username);

    void saveUser(SecUser secUser);

    void updateUser(SecUser secUser, String username);
}
