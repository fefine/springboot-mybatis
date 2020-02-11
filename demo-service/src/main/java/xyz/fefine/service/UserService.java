package xyz.fefine.service;

import xyz.fefine.core.model.User;

public interface UserService {

    User findById(int id);

    User findByName(String name);

    int addUser(User user);

}
