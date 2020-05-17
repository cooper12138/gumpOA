package com.zero.system.service;

import com.zero.system.entity.Salary;

public interface SalaryService {
    /**
     * 查询工资
     * @param name
     * @return
     */
    Salary querySalary(String name);

    /**
     * 设置工资
     * @param salary
     */
    void insertSalary(Salary salary);
}
