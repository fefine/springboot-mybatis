package xyz.fefine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fefine.core.mapper.UserMapper;
import fefine.core.model.User;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User findById(int id) {
        return userMapper.findById(id);
    }

    public User findByName(String name) {
        return userMapper.findByName(name);
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }
}
