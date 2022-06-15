package com.ilearning.design;

import com.ilearning.design.domain.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * [外观模式]非外观模式实现
 *
 * @author yuwenbo
 * @date 2022/6/16 6:51
 **/
public class HaloFacadeController {
    public UserInfo queryUserInfo(@RequestParam String userId) {
        UserInfo userInfo = new UserInfo();
        // 做白名单拦截
        List<String> userList = new ArrayList<String>();
        userList.add("1001");
        userList.add("aaaa");
        userList.add("ccc");
        if (!userList.contains(userId)) {
            userInfo.setCode("1111");
            userInfo.setAddress("非白名单可访问用户拦截！");
            return userInfo;
        }
        userInfo.setName("halo" + userId);
        userInfo.setAge(20);
        userInfo.setAddress("西安市雁塔区高新路100号");
        return userInfo;
    }
}
