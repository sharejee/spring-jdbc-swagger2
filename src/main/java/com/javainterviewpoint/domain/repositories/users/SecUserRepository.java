package com.javainterviewpoint.domain.repositories.users;

import com.javainterviewpoint.domain.models.SecUser;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/12/2018
*/
public interface SecUserRepository {
    List<SecUser> getAllUsers();

    SecUser getUserById(String username);

    void saveUser(SecUser secUser);

    void updateUser(SecUser secUser, String username);
}
