package com.zmg.pandaim.manage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.security.Principal;

/**
 * @author Andy
 * websocket登录连接对象
 * 用于保存websocket连接过程中需要存储的业务参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WebsocketUserAuthentication implements Principal {

    private String token;

    @Override
    public String getName() {
        return token;
    }
}
