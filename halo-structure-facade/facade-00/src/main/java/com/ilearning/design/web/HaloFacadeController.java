package com.ilearning.design.web;

import com.ilearning.design.annotation.DoDoor;
import com.ilearning.design.domain.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 *
 * @author yuwenbo
 * @date 2022/6/16 6:08
 **/
@RestController
public class HaloFacadeController {

    @Value("${server.port}")
    private int port;

    /**
     * @DoDoor 自定义注解
     * key：需要从入参取值的属性字段，如果是对象则从对象中取值，如果是单个值则直接使用
     * returnJson：预设拦截时返回值，是返回对象的Json
     * <p>
     * http://localhost:8080/api/queryUserInfo?userId=1001
     * http://localhost:8080/api/queryUserInfo?userId=小团团
     */
    @DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单可访问用户拦截！\"}")
    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId) {
        return new UserInfo("halo:" + userId, 20, "西安市雁塔区高新路100号");
    }

}
