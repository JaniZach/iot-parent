package com.company.iot.mapper;

/**
 * @author P50
 * @date 2018/3/10 23:50
 */
public interface BaseMapper<T> {

    /** 保存 */
    boolean insert(T t);

    /** 更新 */
    boolean update(T t);

    /** 删除单个 */
    boolean deleteById(Long id);

    /** 查询单个 */
    T getById(Long id);

}
