package com.ilearning.design.impl;

import com.ilearning.design.AuthLink;
import com.ilearning.design.AuthService;
import com.ilearning.design.domain.AuthInfo;

import java.text.ParseException;
import java.util.Date;

/**
 * 三级责任人审批
 *
 * @author yuwenbo
 * @date 2022/6/21 6:12
 **/
public class Level3AuthLink extends AuthLink {
    private Date beginDate = sdf.parse("2020-06-01 00:00:00");
    private Date endDate = sdf.parse("2020-06-25 23:59:59");

    public Level3AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, " 状态：待三级审批负责人 ", levelUserName);
        }
        AuthLink nextLink = super.nextLink();
        if (null == nextLink) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：三级审批负责人完成", " 时间：", sdf.format(date), " 审批人：", levelUserName);
        }

        if (authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：三级审批负责人完成", " 时间：", sdf.format(date), " 审批人：", levelUserName);
        }

        return nextLink.doAuth(uId, orderId, authDate);
    }
}
