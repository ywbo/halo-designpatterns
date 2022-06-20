package com.ilearning.design;

import com.ilearning.design.domain.AuthInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 审批责任链
 * <p>
 * 审核规定；
 * 1. 601-610 三级审批 + 二级审批
 * 2. 611-620 三级审批 + 二级审批 + 一级审批
 * 3. 其他时间 三级审批
 *
 * @author yuwenbo
 * @date 2022/6/21 6:09
 **/
public abstract class AuthLink {
    /**
     * 日志
     */
    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);

    /**
     * 格式化时间
     */
    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 级别人员ID
     */
    protected String levelUserId;

    /**
     * 级别人员姓名
     */
    protected String levelUserName;

    /**
     * 下一个责任链
     */
    private AuthLink nextLink;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink nextLink() {
        return nextLink;
    }

    public AuthLink appendNextLink(AuthLink nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);

}
