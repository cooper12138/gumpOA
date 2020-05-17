package com.zero.system.mapper;

import com.zero.system.entity.Salary;

public interface SalaryMapper {

    /**
     * 查询工资
     * @param id
     * @return
     */
    Salary querySalary(String name);

    /**
     * 设置工资
     * @param salary
     */
    void insertSalary(Salary salary);
}
