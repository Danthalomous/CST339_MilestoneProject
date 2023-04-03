package com.gcu.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LoginMapper implements RowMapper<LoginModel>{
    public LoginModel mapRow(ResultSet resultSet, int i) throws SQLException{
        LoginModel login = new LoginModel(
            resultSet.getLong("id"),
            resultSet.getString("username"),
            resultSet.getString("password"),
            resultSet.getInt("admin")
        );
        return login;
    }
}
