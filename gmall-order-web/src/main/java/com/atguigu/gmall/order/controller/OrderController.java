package com.atguigu.gmall.order.controller;


import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private UserInfoService userInfoService;

    public List<UserAddress> trade(HttpServletRequest request) {

        String userId = request.getParameter("userId");

        List<UserAddress> userAddressList = userInfoService.getUserAddressList(userId);
        return userAddressList;


    }


}
