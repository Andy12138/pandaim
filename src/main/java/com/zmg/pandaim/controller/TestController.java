package com.zmg.pandaim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/jumpPage")
public class TestController {

    // 跳转stomp test 页面
    @GetMapping(value = "/authUser")
    public String toStompWebSocket(HttpSession session, @RequestParam String token){
        System.out.println(token);
        session.setAttribute("testZmg", "钟名桂");
//        String token = VisualDB.TOKEN_DB.get(username);
        // 这里封装一个登录的用户组参数，模拟进入通讯后的简单初始化
//        model.addAttribute("groupId","pandaGroup");
//        model.addAttribute("username", username);
//        model.addAttribute("token",token);
//        System.out.println("跳转：" + username);
//        return "/test/springWebSocketStomp.html";
        return "认证成功！";
    }
}
