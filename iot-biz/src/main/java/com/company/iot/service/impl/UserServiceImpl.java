package com.company.iot.service.impl;

import com.company.iot.domain.UserDO;
import com.company.iot.domain.result.PageResult;
import com.company.iot.domain.result.PojoResult;
import com.company.iot.manager.UserManager;
import com.company.iot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * @author P50
 * @date 2018/3/11 0:04
 */
public class UserServiceImpl implements UserService{

    @Autowired
    private UserManager userManager;

    @Override
    public PojoResult<UserDO> saveOrUpdate(UserDO userDO) {
        boolean success = userManager.saveOrUpdate(userDO);
        PojoResult<UserDO> result = new PojoResult<>(success, null, UUID.randomUUID().toString(), userDO);
        return result;
    }

    @Override
    public PojoResult<UserDO> deleteById(UserDO userDO) {
        return null;
    }

    @Override
    public PageResult<UserDO> getPageResult(UserDO userDO) {
        return null;
    }
}
