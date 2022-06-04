package com.ilearning.design.test;

import com.alibaba.fastjson.JSON;
import com.ilearning.design.MqAdapter;
import com.ilearning.design.OrderAdapterService;
import com.ilearning.design.RebateInfo;
import com.ilearning.design.impl.InsiderOrderService;
import com.ilearning.design.impl.ThirdPartyOrderServiceImpl;
import com.ilearning.design.mq.CreateAccountMq;
import com.ilearning.design.mq.OrderMq;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * 功能测试类
 *
 * @author yuwenbo
 * @date 2022/6/4 23:28
 **/
public class ApiTest {
    @Test
    public void test_MQAdapter() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, ParseException {

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = s.parse("2020-06-01 23:20:16");


        CreateAccountMq create_account = new CreateAccountMq();
        create_account.setNumber("100001");
        create_account.setAddress("河北省.廊坊市.广阳区.大学里职业技术学院");
        create_account.setAccountDate(parse);
        create_account.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MqAdapter.filter(create_account.toString(), link01);
        System.out.println("mq.create_account(适配前)" + create_account.toString());
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));

        System.out.println("");

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(parse);

        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MqAdapter.filter(orderMq.toString(), link02);
        System.out.println("mq.orderMq(适配前)" + orderMq.toString());
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));
    }

    @Test
    public void test_itfAdapter() {
        OrderAdapterService popOrderAdapterService = new ThirdPartyOrderServiceImpl();
        System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService = new InsiderOrderService();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
    }
}
