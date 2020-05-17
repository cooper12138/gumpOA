package com.zero.system.controller;

import com.zero.system.entity.Admin;
import com.zero.system.entity.Salary;
import com.zero.system.service.SalaryService;
import com.zero.system.util.Const;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 个人工资信息
 */

@Controller
@RequestMapping("/manager")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @ApiOperation(value = "跳转个人工资页面", notes = "跳转个人工资页面")
    @GetMapping("/salary")
    public String salary() {
        return "manager/admin/adminSalary";
    }

    @PostMapping("getSalary")
    public Object getSalary( HttpSession session){
        Admin ad = (Admin) session.getAttribute(Const.ADMIN);
        Salary salary = salaryService.querySalary(ad.getUsername());

        return salary;
    }
}
