package com.suxing.controller;

import com.suxing.pojo.User;
import com.suxing.service.UserService;
import com.suxing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author vaingloryss
 * @date 2019/11/1 0001 下午 3:08
 */
@Controller
@RequestMapping("/userController/")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("register")
    public R register(User user){
        userService.register();
        return R.ok();
    }
}
