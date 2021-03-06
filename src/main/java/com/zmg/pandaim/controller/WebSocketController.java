package com.zmg.pandaim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/websocket")
public class WebSocketController {

    // 跳转stomp test 页面
    @RequestMapping(value = "/spring/stompSocket.do",method = RequestMethod.GET)
    public String toStompWebSocket(HttpSession session, HttpServletRequest request, Model model)
    {
        // 这里封装一个登录的用户组参数，模拟进入通讯后的简单初始化
        model.addAttribute("groupId","user_groupId");
        model.addAttribute("session_id",session.getId());
        System.out.println("跳转：" + session.getId());
        session.setAttribute("loginName",session.getId());
        return "/test/springWebSocketStomp.html";

    }
}
