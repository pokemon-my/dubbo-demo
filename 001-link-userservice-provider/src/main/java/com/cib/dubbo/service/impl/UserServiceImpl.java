package com.cib.dubbo.service.impl;

import com.cib.dubbo.model.User;
import com.cib.dubbo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("pokemon");
        return user;
    }
}
