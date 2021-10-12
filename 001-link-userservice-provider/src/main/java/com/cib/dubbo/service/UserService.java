package com.cib.dubbo.service;

import com.cib.dubbo.model.User;

/**
 *  对外提供的服务接口
 */
public interface UserService {
    /**
     *  根据id查user
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
