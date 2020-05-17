package com.zero.system.controller;

import com.zero.system.entity.Admin;
import com.zero.system.entity.TreeMenu;
import com.zero.system.service.TreeMenuService;
import com.zero.system.util.AjaxResult;
import com.zero.system.util.Const;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private AjaxResult ajaxResult;
    @Autowired
    private TreeMenuService treeMenuService;

    /**
     * 跳转后台页面
     * @return
     */
    @ApiOperation(value = "跳转后台页面")
    @GetMapping("/index")
    public String index(){
        return "manager/index";
    }

    /**
     * 异步加载权限树
     * @param session
     * @return
     */
    @ApiOperation(value = "异步加载权限树")
    @PostMapping("/treeMenu")
    @ResponseBody
    public Object treeMenu(HttpSession session){
        //校验是否登录
        if(!StringUtils.isEmpty(session.getAttribute(Const.TREEMENU))){
            return session.getAttribute(Const.TREEMENU);
        }
        //获取用户对象
        Admin admin = (Admin) session.getAttribute(Const.ADMIN);
        //根据用户id加载权限树
        List<TreeMenu> treeMenuList = treeMenuService.selectByAdminId(admin.getId());
        //设置权限树集合到session
        session.setAttribute(Const.TREEMENU,treeMenuList);
        return treeMenuList;
    }

    /**
     * 异步加载后台主页
     * @return
     */
    @ApiOperation(value = "异步加载后台主页")
    @GetMapping("/console")
    public String console(){
        return "manager/console";
    }

}
