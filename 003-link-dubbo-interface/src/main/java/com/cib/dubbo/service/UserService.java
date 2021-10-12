package com.cib.dubbo.service;

import com.cib.dubbo.bean.User;

public interface UserService {
    /**
     * 对外暴露的接口
     * @param id
     * @return
     */
    User findUserById(Integer id);


}
