package com.company.iot.domain.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author P50
 * @date 2018/3/11 0:10
 */
@Setter
@Getter
@ToString
public class PageResult<T> extends BaseResult {

    /** 结果集 */
    private List<T> content;

    /** 分页大小 */
    private int limit;

    /** 当前页 */
    private int currentPage;

    /** 总数量 */
    private int total;

}
