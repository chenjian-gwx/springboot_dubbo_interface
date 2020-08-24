package com.cj.Service;

import com.cj.model.Users;

import java.util.List;

public interface UserService {

    Users selectByUsernameAndPassword(String username, String password);

    List<Users> selectAll();
}
