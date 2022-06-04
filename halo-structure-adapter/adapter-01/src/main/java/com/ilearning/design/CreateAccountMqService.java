package com.ilearning.design;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.mq.CreateAccountMq;

/**
 * 创建用户
 *
 * @author yuwenbo
 * @date 2022/6/4 23:08
 **/
public class CreateAccountMqService {
    public void onMessage(String message) {
        CreateAccountMq mq = JSON.parseObject(message, CreateAccountMq.class);

        mq.getAccountDate();
        mq.getNumber();

        // ... 处理自己的业务逻辑
    }
}
