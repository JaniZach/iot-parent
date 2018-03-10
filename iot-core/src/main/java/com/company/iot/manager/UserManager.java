package com.company.iot.manager;

import com.company.iot.domain.UserDO;
import com.company.iot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author P50
 * @date 2018/3/10 23:54
 */
@Service
public class UserManager {

    @Autowired
    private UserMapper userMapper;

    /**
     * 保存方法
     * @param userDO
     * @return
     */
    public boolean saveOrUpdate(UserDO userDO) {
        boolean result = true;
        if (userDO.getId()!=null) {
            result = userMapper.update(userDO);
        } else {
            result = userMapper.insert(userDO);
        }
        return result;
    }

    /**
     * 删除单个的方法
     * @param id
     * @return
     */
    public boolean deleteById(Long id) {
        boolean result = userMapper.deleteById(id);
        return result;
    }

    /**
     * 查询单个的方法
     * @param id
     * @return
     */
    public UserDO getById(Long id) {
        UserDO byId = userMapper.getById(id);
        return byId;
    }

}
