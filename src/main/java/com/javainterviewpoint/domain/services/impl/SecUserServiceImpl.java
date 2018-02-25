package com.javainterviewpoint.domain.services.impl;

import com.javainterviewpoint.domain.models.SecUser;
import com.javainterviewpoint.domain.repositories.users.SecUserRepository;
import com.javainterviewpoint.domain.services.SecUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/12/2018
*/
@Service("secUserService")
public class SecUserServiceImpl implements SecUserService {
    @Autowired
    private SecUserRepository secUserRepository;

    public List<SecUser> getAllUsers() {
        return (List<SecUser>) secUserRepository.getAllUsers();
    }

    public SecUser getUserById(String username) {
        return null;
    }

    public void saveUser(SecUser secUser) {

    }

    public void updateUser(SecUser secUser, String username) {

    }
}
