package xyz.fefine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.fefine.core.mapper.UserMapper;
import xyz.fefine.core.model.User;

@Service
@Transactional(propagation = Propagation.REQUIRED)
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
