package com.company.iot.domain.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author P50
 * @date 2018/3/11 0:05
 */
@Setter
@Getter
@ToString
public class BaseResult {

    /** 是否成功 */
    protected boolean success;

    /** 错误信息 */
    protected String errorMsg;

    /** 请求id */
    protected String requestId;

}
