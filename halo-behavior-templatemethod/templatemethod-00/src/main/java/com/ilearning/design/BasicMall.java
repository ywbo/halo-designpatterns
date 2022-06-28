package com.ilearning.design;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 基础电商推广服务
 * <p>
 * 1. 生成最优价商品海报
 * 2. 海报含带推广邀请码
 *
 * @author yuwenbo
 * @date 2022/6/29 6:53
 **/
@Data
public abstract class BasicMall {

    protected Logger logger = LoggerFactory.getLogger(BasicMall.class);
    /**
     * 用户ID
     */
    String uId;

    /**
     * 用户密码
     */
    String uPwd;

    public BasicMall(String uId, String uPwd) {
        this.uId = uId;
        this.uPwd = uPwd;
    }

    /**
     * 生成商品推广海报
     *
     * @param skuUrl 商品地址(京东、淘宝、当当)
     * @return 海报图片base64位信息
     */
    public String generateGoodsPoster(String skuUrl) {
        // 1. 验证登录
        if (!login(uId, uPwd)) {
            return null;
        }
        // 2. 爬虫商品
        Map<String, String> reptile = reptile(skuUrl);
        // 3. 组装海报
        return createBase64(reptile);
    }

    // 模拟登录
    protected abstract Boolean login(String uId, String uPwd);

    // 爬虫提取商品信息(登录后的优惠价格)
    protected abstract Map<String, String> reptile(String skuUrl);

    // 生成商品海报信息
    protected abstract String createBase64(Map<String, String> goodsInfo);
}
