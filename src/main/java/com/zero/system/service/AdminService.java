package com.zero.system.service;

import com.zero.system.entity.Admin;
import com.zero.system.util.PageBean;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Map;

/**
 * 用户服务接口
 */
public interface AdminService extends UserDetailsService {

    Admin login(String username, String password);

    PageBean<Admin> queryPage(Map<String, Object> paramMap);

    int insertAdmin(Admin admin);

    Admin selectById(Integer id);

    int delByAdminIds(List<Integer> ids);

    int editByAdmin(Admin admin);

    Admin selectByName(String username);

    Admin selectByEmail(String email);
}
