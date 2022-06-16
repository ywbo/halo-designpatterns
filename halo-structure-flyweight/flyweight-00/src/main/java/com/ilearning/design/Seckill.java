package com.ilearning.design;

import lombok.Data;

import java.util.Date;

/**
 * 秒杀 共有体
 *
 * @author yuwenbo
 * @date 2022/6/16 22:20
 **/
@Data
public class Seckill {
    /**
     * 活动ID
     */
    private Long id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动描述
     */
    private String desc;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date stopTime;
    
    /**
     * 活动库存
     */
    private Stock stock;
}
