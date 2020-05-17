package com.zero.system.service.Impl;

import com.zero.system.entity.Holiday;
import com.zero.system.mapper.HolidayMapper;
import com.zero.system.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayServiceImpl implements HolidayService {

    @Autowired
    private HolidayMapper holidayMapper;

    @Override
    public List<Holiday> queryHoliday(String name) {
        return holidayMapper.queryHoliday(name);
    }

    @Override
    public void insertHoliday(Holiday holiday) {
        holidayMapper.insertHoliday(holiday);
    }
}
