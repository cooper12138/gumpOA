package com.zero.system.mapper;

import com.zero.system.entity.Log;

import java.util.List;
import java.util.Map;


public interface LogMapper {

    void insertByLog(Log log);

    /**
     * 根据条件查询登录日志
     * @param paramMap
     * @return
     */
    List<Log> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int delByLogIds(List<Integer> ids);
}
