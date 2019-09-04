package org.ymh.restdemo;


import com.alibaba.dubbo.config.annotation.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Service
@Path("user")
public class UserServiceImpl implements UserService {

    @GET
    @Path("/findUser")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
    @Override
    public User Query() {
        User user = new User();
        user.setAddr("陕西西安");
        user.setId(1);
        return user;
    }
}
