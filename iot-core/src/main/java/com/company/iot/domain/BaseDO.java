package com.company.iot.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author P50
 * @date 2018/3/10 23:30
 */
@Setter
@Getter
public class BaseDO {
    /** 主键id */
    private Long id;

    /** 创建时间 */
    private Date creatTime;

    /** 修改时间 */
    private Date modifierTime;

    /** 创建者 */
    private Long creator;

    /** 修改者 */
    private Long modifier;

    /** 是否删除 */
    private Boolean isDeleted;
}
