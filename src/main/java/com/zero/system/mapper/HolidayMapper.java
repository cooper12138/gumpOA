package com.zero.system.mapper;

import com.zero.system.entity.Holiday;

import java.util.List;

/**
 * @author gump(zzc)
 * @version 1.0
 * @date 2020/5/17 22:59
 */
public interface HolidayMapper {

    /**
     * 根据用户名查询假条
     * @param name
     * @return
     */
    List<Holiday> queryHoliday(String name);

    /**
     * 插入请假条
     * @param holiday
     */
    void insertHoliday(Holiday holiday);
}
