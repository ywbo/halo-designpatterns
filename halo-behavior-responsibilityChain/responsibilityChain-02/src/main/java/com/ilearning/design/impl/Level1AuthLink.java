package com.ilearning.design.impl;

import com.ilearning.design.AuthLink;
import com.ilearning.design.AuthService;
import com.ilearning.design.domain.AuthInfo;

import java.util.Date;

/**
 * 一级责任人审批
 *
 * @author yuwenbo
 * @date 2022/6/21 6:10
 **/
public class Level1AuthLink extends AuthLink {

    public Level1AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("10001_" + levelUserId, "单号：", orderId, " 状态： 待一级审批人审批。", levelUserName);
        }
        AuthLink nextLink = super.nextLink();
        if (null == nextLink) {
            return new AuthInfo("0000", "单号：", orderId, " 状态：一级审批完成负责人", " 时间：", sdf.format(date), " 审批人：", levelUserName);
        }
        return nextLink.doAuth(uId, orderId, authDate);
    }
}
