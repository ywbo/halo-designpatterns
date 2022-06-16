package com.ilearning.design;

import lombok.Data;

/**
 * 库存总量
 *
 * @author yuwenbo
 * @date 2022/6/16 22:22
 **/
@Data
public class Stock {
    /**
     * 库存总量
     */
    private int total;

    /**
     * 库存已用
     */
    private int used;

    public Stock(int total, int used) {
        this.total = total;
        this.used = used;
    }
}
