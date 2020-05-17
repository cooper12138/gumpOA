package com.zero.system.service;

import com.zero.system.entity.Holiday;

import java.util.List;

public interface HolidayService {

    List<Holiday> queryHoliday(String name);

    /**
     * 插入请假条
     * @param holiday
     */
    void insertHoliday(Holiday holiday);



}
