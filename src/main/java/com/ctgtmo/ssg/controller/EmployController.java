package com.ctgtmo.ssg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctgtmo.ssg.model.EmployLinkman;
import com.ctgtmo.ssg.service.EmployService;
import com.ctgtmo.ssg.utils.ApiResponse;
import com.ctgtmo.ssg.utils.ResponseMsg;

/**
 * <p>ClassName: EmployController.java</p>
 * <p>Company: 乾通互联(北京)科技有限公司</p>
 * <p>Description: 员工信息api实现</p>
 * <p>author wanggongliang</p>
 * <p>2018年12月4日 下午3:02:26</p>
 */
@RestController
@RequestMapping("/employ")
public class EmployController {

    //注入service接口
    @Autowired
    private EmployService employService;

    /**
     * @Title:queryLinkMan
     * @Description:根据员工主键查询紧急联系人信息
     * @param employId 员工主键
     * @return
     */
    @GetMapping("/queryLinkMan")
    public ApiResponse queryLinkMan(@RequestParam String employId) {
        // 返回结果集合声明
        ApiResponse response = null;
        try {
            //调取查询列表接口的方法
            List<EmployLinkman> list = employService.queryLinkmanList(employId);
            // 返回和封装结果集
            response = new ApiResponse(ApiResponse.SUCCESS, ResponseMsg.QUERY_SUCCESS);
            response.setData(list);
        } catch (Exception e) {
            // 错误处理及返回
            response = new ApiResponse(ApiResponse.FAIL, ResponseMsg.QUERY_FAIL);
            e.printStackTrace();
        }
        return response;
    }
}
