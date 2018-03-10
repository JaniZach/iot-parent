package com.company.iot.service;

import com.company.iot.domain.UserDO;
import com.company.iot.domain.result.PageResult;
import com.company.iot.domain.result.PojoResult;

/**
 * @author P50
 * @date 2018/3/11 0:02
 */
public interface UserService {

    /**
     * 保存或更新的接口
     * @param userDO
     * @return
     */
    PojoResult<UserDO> saveOrUpdate(UserDO userDO);

    /**
     * 删除单个的接口
     * @param userDO
     * @return
     */
    PojoResult<UserDO> deleteById(UserDO userDO);

    /**
     * 分院查询的接口
     * @param userDO
     * @return
     */
    PageResult<UserDO> getPageResult(UserDO userDO);

}
