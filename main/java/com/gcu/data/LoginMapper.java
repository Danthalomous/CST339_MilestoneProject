package com.gcu.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gcu.model.LoginModel;

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