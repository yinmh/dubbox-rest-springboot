package org.ymh.restdemo;


import com.alibaba.dubbo.config.annotation.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


public interface UserService {
    //注册
    User Query();
}