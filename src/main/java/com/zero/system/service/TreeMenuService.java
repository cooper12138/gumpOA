package com.zero.system.service;

import com.zero.system.entity.TreeMenu;

import java.util.List;


public interface TreeMenuService {

    List<TreeMenu> selectByAdminId(Integer id);


    List<TreeMenu> selectAll();

    TreeMenu selectById(Integer id);

    TreeMenu selectByName(String name);

    TreeMenu selectByUrl(String url);

    int editByPermission(TreeMenu treeMenu);

    int insertPermission(TreeMenu treeMenu);

    int delByPermissionIds(List<Integer> ids);

    List<TreeMenu> selectByPid(Integer id);

    List<TreeMenu> selectByRoleId(Integer id);

    int updateRolePermission(List<Integer> ids, Integer id);
}
