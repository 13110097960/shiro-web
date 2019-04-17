package com.baizhi;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class controller {
    @RequestMapping("login")
    public String login(String username,String password){
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username,password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(usernamePasswordToken);
        } catch (IncorrectCredentialsException e) {
            System.out.println("密码错误");
            return "login";
        }catch (UnknownAccountException e) {
            System.out.println("账户错误");
            return "login";
        }
        return "index";
    }
}
