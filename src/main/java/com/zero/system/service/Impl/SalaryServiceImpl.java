package com.zero.system.service.Impl;

import com.zero.system.entity.Salary;
import com.zero.system.mapper.SalaryMapper;
import com.zero.system.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryMapper salaryMapper;

    @Override
    public Salary querySalary(String name) {
        return salaryMapper.querySalary(name);
    }

    @Override
    public void insertSalary(Salary salary) {
        salaryMapper.insertSalary(salary);
    }
}
