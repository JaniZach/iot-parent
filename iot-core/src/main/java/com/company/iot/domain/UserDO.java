package com.company.iot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author P50
 * @date 2018/3/10 23:35
 *
 * 用户对象
 */
@Setter
@Getter
@ToString
public class UserDO extends BaseDO {

    private String code;

    private String name;

    private String nickname;

}
