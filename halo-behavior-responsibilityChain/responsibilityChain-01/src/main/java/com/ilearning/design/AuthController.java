package com.ilearning.design;

import com.ilearning.design.domain.AuthInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 审批服务控制类
 *
 * @author yuwenbo
 * @date 2022/6/21 5:40
 **/
public class AuthController {

    private final AuthService authService = new AuthService();

    /**
     * 格式化时间
     */
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public AuthInfo doAuth(String uId, String orderId, Date authDate) throws ParseException {
        // 三级审批
        Date date = AuthService.queryAuthInfo("10001_3", orderId);
        if (null == date) {
            return new AuthInfo("10001_3", "单号：", orderId, " 状态：待第三责任人审批。", "halo_3");
        }

        // 二级审批
        if (authDate.after(sdf.parse("2022-06-01 00:00:00")) && authDate.before(sdf.parse("2022-06-30 23:59:59"))) {
            date = AuthService.queryAuthInfo("10001_2", orderId);
            if (null == date) {
                return new AuthInfo("10001_2", "单号：", orderId, " 状态：待第二责任人审批。", "halo_2");
            }
        }

        // 一级审批
        if (authDate.after(sdf.parse("2022-06-11 00:00:00")) && authDate.before(sdf.parse("2022-06-20 23:59:59"))) {
            date = AuthService.queryAuthInfo("10001_1", orderId);
            if (null == date) {
                return new AuthInfo("10001_1", "单号：", orderId, " 状态：待第一责任人审批。", "halo_1");
            }
        }
        
        return new AuthInfo("10001", "单号：", orderId, "状态：审批完成。");
    }
}
