package com.javainterviewpoint.domain.repositories.users.impl;

import com.javainterviewpoint.domain.models.SecUser;
import com.javainterviewpoint.domain.repositories.users.SecUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/12/2018
*/
@Repository
@Qualifier("secUserRepository")
public class SecUserRepositoryImpl implements SecUserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public List<SecUser> getAllUsers() {
        String sql = "select *from users";

        List<SecUser> secUsers = jdbcTemplate.query(sql, new ResultSetExtractor<List<SecUser>>() {
            public List<SecUser> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<SecUser> list = new ArrayList<SecUser>();
                while (rs.next()) {
                    SecUser secUser = new SecUser();
                    secUser.setUsername(rs.getString("username"));
                    secUser.setPassword(rs.getString("password"));
                    secUser.setEnabled(rs.getBoolean("enabled"));

                    list.add(secUser);
                }
                return list;
            }

        });
        return secUsers;
    }

    public SecUser getUserById(String username) {
        return null;
    }

    public void saveUser(SecUser secUser) {

    }

    public void updateUser(SecUser secUser, String username) {

    }
}
