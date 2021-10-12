package com.cib.dubbo.provider.service.impl;

import com.cib.dubbo.bean.User;
import com.cib.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


/**
 * 使用的是org.apache.dubbo.config.annotation的Service
 */
@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("pokemon");
        return user;
    }
}
