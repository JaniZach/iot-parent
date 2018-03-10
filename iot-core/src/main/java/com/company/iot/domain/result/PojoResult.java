package com.company.iot.domain.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author P50
 * @date 2018/3/11 0:09
 */
@Setter
@Getter
@ToString
public class PojoResult<T> extends BaseResult {

    public PojoResult () {}

    public PojoResult (boolean success,String errorMsg,String requestId,T content) {
        this.success = success;
        this.errorMsg = errorMsg;
        this.requestId = requestId;
        this.content = content;
    }

    /** 结果 */
    private T content;

}
