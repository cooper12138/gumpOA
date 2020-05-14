package com.zero.system.service;

import com.zero.system.entity.Log;
import com.zero.system.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * 登录接口
 */
public interface LogService {
    void insertByLog(Log log);

    PageBean<Log> queryPage(Map<String, Object> paramMap);

    int delByLogIds(List<Integer> ids);
}
